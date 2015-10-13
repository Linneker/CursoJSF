/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.to;

import br.com.cursojsf.util.PegandoUrlDoCaminhoDoArquivoDeConfiguracao;
import br.com.ln.bancodedados.objeto.NomeDasTagsDoArquivoPropertie;

/**
 *
 * @author Linneker
 */
public class Tags {
     private NomeDasTagsDoArquivoPropertie tags;
    public Tags(){
    	tags = new NomeDasTagsDoArquivoPropertie();
    	tags.setCaminhoDoArquivoProperties(PegandoUrlDoCaminhoDoArquivoDeConfiguracao.getUrl());
    	tags.setNomeDoArquivoProperties("tags.properties");
    	tags.setTagForName("forNameMySql");
    	tags.setTagJdbc("caminhoJdbcMySql");
    	tags.setTagUsuario("usuario");
    	tags.setTagSenha("senha");
    }
    
    public NomeDasTagsDoArquivoPropertie getTags(){
    	return tags;
    }
    
}
