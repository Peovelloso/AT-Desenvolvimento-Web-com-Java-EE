package br.edu.infet.appwebtabacaria.model.domain;

public class Isqueiro extends Produto {

	private String cor;
	private float tamanho;
	private String marca;
	
	public Isqueiro(String nome, float tamanho, int codigo) {
		super(nome, tamanho, codigo);
	
	}

	@Override
	public float calcularValorVenda() {
		
		return getValor();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();	
		sb.append(super.toString());
		sb.append(";");
		sb.append(cor);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(marca);
		sb.append(";");
		sb.append(calcularValorVenda());
	
		return sb.toString();

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}




	}