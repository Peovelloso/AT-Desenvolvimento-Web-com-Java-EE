package br.edu.infet.appwebtabacaria.model.domain;

public class Comprador {
	
	private String nome;
	private String cpf;
	private String email;
	
	
	public Comprador(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;

	}
	

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(email);
				
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
