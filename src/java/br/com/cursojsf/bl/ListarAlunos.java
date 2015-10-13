/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.bl;

import br.com.cursojsf.dal.Crud;
import br.com.cursojsf.to.Aluno;
import br.com.cursojsf.to.ListaDeAlunos;
import br.com.cursojsf.to.Tags;
import br.com.cursojsf.util.PegandoComandoSqlAluno;
import br.com.ln.bancodedados.objeto.NomeDasTagsDoArquivoPropertie;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Linneker
 */
@ManagedBean(name="ListarAlunos")
public class ListarAlunos {

    public ArrayList<Aluno> getListaAlunosAprovados() {
        String query = new PegandoComandoSqlAluno().getProperties("SELECT_APROVADO_FINAL_REPROVADO");
        NomeDasTagsDoArquivoPropertie tag = new Tags().getTags();
        Aluno aluno = new Aluno();
        ListaDeAlunos listaAlunos = new ListaDeAlunos();
        ListaDeAlunos listaAprovados = new ListaDeAlunos();
        Crud crudAluno = new Crud(aluno);
        ArrayList<Object> lista = crudAluno.selects(query, tag);
        for (Object item : lista) {
            aluno = (Aluno) item;
            listaAlunos.add(aluno);
        }
        for(Aluno alunosAprovado : listaAlunos){
            if(alunosAprovado.getResultadoNota().equalsIgnoreCase("Aprovado")){
                System.out.println(alunosAprovado.getNome());
                listaAprovados.add(alunosAprovado);
            }
        }
        return listaAlunos;
    }

    public ListaDeAlunos getListarAlunosReprovados() {
        String query = new PegandoComandoSqlAluno().getProperties("SELECT_APROVADO_FINAL_REPROVADO");
        NomeDasTagsDoArquivoPropertie tag = new Tags().getTags();
        Aluno aluno = new Aluno();
        ListaDeAlunos listaAlunos = new ListaDeAlunos();
        Crud crudAluno = new Crud(aluno);
        ArrayList<Object> lista = crudAluno.selects(query, tag);
        for (Object item : lista) {
            aluno = (Aluno) item;
            listaAlunos.add(aluno);
        }
        return listaAlunos;
    }

    public ListaDeAlunos getListarAlunosDeFinal() {
        String query = new PegandoComandoSqlAluno().getProperties("SELECT_APROVADO_FINAL_REPROVADO");
        NomeDasTagsDoArquivoPropertie tag = new Tags().getTags();
        Aluno aluno = new Aluno();
        ListaDeAlunos listaAlunos = new ListaDeAlunos();
        Crud crudAluno = new Crud(aluno);
        ArrayList<Object> lista = crudAluno.selects(query, tag);
        for (Object item : lista) {
            aluno = (Aluno) item;
            listaAlunos.add(aluno);
        }
        return listaAlunos;
    }

}
