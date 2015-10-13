/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.dal;

import br.com.cursojsf.to.Aluno;
import br.com.ln.bancodedados.Abrir;
import br.com.ln.bancodedados.ComandoBasicosSql;
import br.com.ln.bancodedados.ConexaoStatement;
import br.com.ln.bancodedados.ExecuteQuery;
import br.com.ln.bancodedados.Fechar;
import br.com.ln.bancodedados.RetornoDados;
import br.com.ln.bancodedados.objeto.NomeDasTagsDoArquivoPropertie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linneker
 */
public class Crud implements ComandoBasicosSql {

    Aluno aluno;

    public Crud(Aluno aluno) {
        aluno = new Aluno();
    }

    @Override
    public Object select(String string, NomeDasTagsDoArquivoPropertie ndtdap) {
        return null;
    }

    @Override
    public ArrayList<Object> selects(String query, NomeDasTagsDoArquivoPropertie tag) {
        ArrayList<Object> listUser = new ArrayList<Object>();
        
        Connection cn = null;
        PreparedStatement ps = null;
        try {
            cn = Abrir.openConnection(tag);
            ps = ConexaoStatement.steatement(cn, query);
            ResultSet rs = new RetornoDados().getSelect(ps);
            while (rs.next()) {
                aluno = new Aluno();
                aluno = preenchendoAluno(rs);
                listUser.add(aluno);
                System.out.println("Usuario " + aluno.getNome() + " Encontrado");
            }
            return listUser;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                Fechar.closeConnection(cn, ps);
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.err.println("Usuario Encontrado");
        return null;
    }

    @Override
    public boolean insert(String string, NomeDasTagsDoArquivoPropertie ndtdap) {
        return false;
    }

    @Override
    public boolean update(String string, NomeDasTagsDoArquivoPropertie ndtdap) {
        return false;
    }

    @Override
    public boolean delete(String query, NomeDasTagsDoArquivoPropertie tag) {
        Connection cn = null;
        PreparedStatement ps = null;
        try {
            cn = Abrir.openConnection(tag);
            ps = ConexaoStatement.steatement(cn, query);
            int deletado = ExecuteQuery.executeQuery(ps);
            int SUCESSO = 0;
            if (deletado == SUCESSO) {
                System.out.println("Usuario Deletado Com Sucesso");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Fechar.closeConnection(cn, ps);
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.err.println("Usuario Não Deletado");
        return false;
    }

    private Aluno preenchendoAluno(ResultSet rs) {
        try {
            aluno.setMatricula(rs.getInt("Matricula"));
            aluno.setNome(rs.getString("Nome"));
            aluno.setNotaDoPrimeiroBimestre(rs.getInt("NotaDoPrimeiroBimestre"));
            aluno.setNotaDoSegundoBimestre(rs.getInt("NotaDoSegundoBimestre"));
            aluno.setNotaFinalESituacao(rs.getInt("NotaFinal"));
            aluno.setSituacao(rs.getString("Situacao"));
            aluno.setResultadoNota(rs.getString("NOTA"));
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    return aluno;
    }

}
