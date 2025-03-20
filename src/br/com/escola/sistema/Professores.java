package br.com.escola.sistema;

public class Professores {
	
	public String nome;
	public String formacao;
	public int anoIngresso;

	public Professores(String nome, String formacao, int anoIngresso) {
		super();
		this.nome = nome;
		this.formacao = formacao;
		this.anoIngresso = anoIngresso;
	}

	public void leciona() {
		
		System.out.println(" O professor leciona: "+formacao);
	}
	
	public void participa() {

			System.out.println(" O professor está na instituição desde: "+anoIngresso);
			
		}
	}

