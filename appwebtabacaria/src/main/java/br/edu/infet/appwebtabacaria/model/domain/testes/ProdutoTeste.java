package br.edu.infet.appwebtabacaria.model.domain.testes;

import br.edu.infet.appwebtabacaria.model.domain.Cachimbo;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
	//Instanciar as classes filhas - 
		//Cachimbo, 
		//Tabacos, 
		//isqueiros, 
		//Suporte p/ cachimbo	
		
		Cachimbo cachimbo = new Cachimbo("Kush", 150, 1);
		
		cachimbo.setCor("Marrom");
		cachimbo.setMarca("Kush");
		cachimbo.setTamanho(10);
		System.out.println(cachimbo);
		
		// instanciar as outras filhas
		
		//Tabaco
		
		
	    //isqueriros
		
		//Suporte p/ cachimbo
		
		
		Cachimbo cachimbo2 = new Cachimbo("Bros", 350, 2);
		
		cachimbo2.setCor("Preto");
		cachimbo2.setMarca("Bros");
		cachimbo2.setTamanho(10);
		System.out.println(cachimbo2.calcularValorVenda());
	
		
	}


}
