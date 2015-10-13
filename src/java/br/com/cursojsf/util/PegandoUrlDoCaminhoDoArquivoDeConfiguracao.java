/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojsf.util;

import java.net.URISyntaxException;

/**
 *
 * @author Linneker
 */
public class PegandoUrlDoCaminhoDoArquivoDeConfiguracao {
    public static String getUrl(){
		try {
			System.out.println(PegandoUrlDoCaminhoDoArquivoDeConfiguracao.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());//+"br/com/cursojsf/arquivo/".replaceFirst("/", ""));
			return "C:\\Users\\Linneker\\Documents\\NetBeansProjects\\CursoJSF\\CursoJsf\\build\\web\\WEB-INF\\classes\\br\\com\\cursojsf\\arquivo\\";//PegandoUrlDoCaminhoDoArquivoDeConfiguracao.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()+"br/com/cursojsf/arquivo/";
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "URL NÃO ENCONTRADA";
	}
}
