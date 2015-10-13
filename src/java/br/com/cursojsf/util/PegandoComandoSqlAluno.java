/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.util;

import br.com.ln.loadpropertie.LoadPropertie;

/**
 *
 * @author Linneker
 */
public class PegandoComandoSqlAluno extends LoadPropertie{
   	
	private final static String CAMINHO_DO_ARQUIVO_COMANDO_SQL_USUARIO =PegandoUrlDoCaminhoDoArquivoDeConfiguracao.getUrl();
	private final static String NOME_DO_ARQUIVO_COMANDO_SQL_USUARIO = "ComandoSql.properties";
	public PegandoComandoSqlAluno() {
		super(NOME_DO_ARQUIVO_COMANDO_SQL_USUARIO, CAMINHO_DO_ARQUIVO_COMANDO_SQL_USUARIO);
		// TODO Auto-generated constructor stub
	}
	
	public String query(String comando){
		return getProperties(comando);
	}

}
