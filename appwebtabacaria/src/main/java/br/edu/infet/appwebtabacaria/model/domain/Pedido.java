package br.edu.infet.appwebtabacaria.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Pedido {
	
	private String descrição;
	private LocalDateTime data; //data
	private boolean web; 
	private Comprador comprador; //relacionamento
	private List<Produto> produtos;
	
	//Com essa estrutura esta associando o produto ao comprador.
	
	public Pedido() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(descrição);	
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(web ? "web" : "loja");
		sb.append(";");
		sb.append(comprador.toString());
		sb.append(";");
		sb.append(produtos.size());
		
		return sb.toString();
		
	}
	
	
	
	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	public Comprador getComprador() {
		return comprador;
	}
	
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
	

}
