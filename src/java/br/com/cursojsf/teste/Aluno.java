/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.teste;

import br.com.cursojsf.bl.ListarAlunos;
import br.com.cursojsf.to.ListaDeAlunos;
import java.util.ArrayList;

/**
 *
 * @author Linneker
 */
public class Aluno {

    public static void main(String[] args) {
        ListarAlunos listarAlunos = new ListarAlunos();
        ArrayList<br.com.cursojsf.to.Aluno> listaAlunos = listarAlunos.getListaAlunosAprovados();
        for(br.com.cursojsf.to.Aluno aluno : listaAlunos){
            System.out.println("Matricula: "+aluno.getMatricula());
            System.out.println("Nome: "+aluno.getNome());
            
        }
    }
    
}
