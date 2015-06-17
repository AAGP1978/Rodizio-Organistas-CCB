package com.rodizio.www.visao.controle;
/**
 * Classe Reponsavel por Implementar o Padr�o Singleton
 * � utulizada quando se deseja obter apenas uma 
 * Instancia do objeto em quest�o, na mem�ria do Computador.
 * @author Wesley
 *
 */
public class SingletonJanela {
	private static SingletonJanela instanciaJanela;
	private SingletonJanela(){}
 
	public static SingletonJanela getInstance(){
		if (instanciaJanela == null){
			instanciaJanela = new SingletonJanela();
		}
	return instanciaJanela;
	}
}
