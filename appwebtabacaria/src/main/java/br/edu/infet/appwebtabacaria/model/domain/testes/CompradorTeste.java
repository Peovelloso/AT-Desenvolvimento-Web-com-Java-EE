package br.edu.infet.appwebtabacaria.model.domain.testes;

import br.edu.infet.appwebtabacaria.model.domain.Comprador;

public class CompradorTeste {
	
	public static void main(String[] args) {
		
		Comprador comprador = new Comprador("PeoVelloso", "123456", "peovelloso@peo.com");
		System.out.println(comprador);
		
		
	}

}
