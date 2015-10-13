/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.bl;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Linneker
 */

public class Cadastro {
    private String nome;

    public String getAluno() {
        return nome;
    }

    public void setAluno(String nome) {
        
    }
    
    public String cadastrar(){
        
        return "result.xhtml";
    }
}
