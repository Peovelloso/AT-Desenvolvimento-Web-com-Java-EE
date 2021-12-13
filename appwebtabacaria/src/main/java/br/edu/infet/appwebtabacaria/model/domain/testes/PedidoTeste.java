package br.edu.infet.appwebtabacaria.model.domain.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infet.appwebtabacaria.model.domain.Comprador;
import br.edu.infet.appwebtabacaria.model.domain.Isqueiro;
import br.edu.infet.appwebtabacaria.model.domain.Pedido;
import br.edu.infet.appwebtabacaria.model.domain.Produto;
import br.edu.infet.appwebtabacaria.model.domain.Tabaco;

public class PedidoTeste {
	
	public static void main(String[] args) {
		
		
		Comprador comprador = new Comprador("PeoVello", "peo@peo.com", "123456789-15");
		
		Isqueiro zippinho = new Isqueiro("Zipao", 15, 22);
		zippinho.setCor("prata");
		zippinho.setMarca("Zippao");
		zippinho.setTamanho(25);
		
		Tabaco tabaco  = new Tabaco("Abile", 25, 988);
		tabaco.setMarca("Importado");
		tabaco.setTamanho(500);
		
		List<Produto> listadeIsqueiro = new ArrayList<Produto>();
		listadeIsqueiro.add(tabaco);
		listadeIsqueiro.add(zippinho);
		
		
		
			
		Pedido tabaco2 = new Pedido();
		tabaco2.setDescrição("Tabaco");
		tabaco2.setWeb(true);
		tabaco2.setComprador(comprador);
		System.out.println(tabaco2);		
		
		Pedido isqueiro2 = new Pedido();
		isqueiro2.setDescrição("Isqueiro");
		isqueiro2.setWeb(false);
		isqueiro2.setComprador(comprador);
		isqueiro2.setProdutos(listadeIsqueiro);
		System.out.println(isqueiro2);
		
		
		Tabaco tabaco3 = new Tabaco("Atebloblo", 50, 15);
		tabaco3.setCor("marrom");
		tabaco3.setMarca("atebloblo");
		tabaco3.setTamanho(350);
		
				
		Isqueiro isqueiro = new Isqueiro("Zippo", 350, 25);
		isqueiro.setCor("Prata");
		isqueiro.setMarca("Zippo");
		isqueiro2.setProdutos(null);
		System.out.println(tabaco2);
		
		
		
	}	
}
