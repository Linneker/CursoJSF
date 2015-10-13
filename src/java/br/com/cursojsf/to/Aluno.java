/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.to;

/**
 *
 * @author Linneker
 */
public class Aluno {

    private int matricula;
    private String nome;
    private int notaDoPrimeiroBimestre;
    private int notaDoSegundoBimestre;
    private int notaFinalESituacao;
    private String situacao;
    private String resultadoNota;

    public String getResultadoNota() {
        return resultadoNota;
    }

    public void setResultadoNota(String resultadoNota) {
        this.resultadoNota = resultadoNota;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaDoPrimeiroBimestre() {
        return notaDoPrimeiroBimestre;
    }

    public void setNotaDoPrimeiroBimestre(int notaDoPrimeiroBimestre) {
        this.notaDoPrimeiroBimestre = notaDoPrimeiroBimestre;
    }

    public int getNotaDoSegundoBimestre() {
        return notaDoSegundoBimestre;
    }

    public void setNotaDoSegundoBimestre(int notaDoSegundoBimestre) {
        this.notaDoSegundoBimestre = notaDoSegundoBimestre;
    }

    public int getNotaFinalESituacao() {
        return notaFinalESituacao;
    }

    public void setNotaFinalESituacao(int notaFinalESituacao) {
        this.notaFinalESituacao = notaFinalESituacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
