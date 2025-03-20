package br.com.escola.sistema;

public class Disciplinas {

	public String nome;
	public int cargaHoraria;
	public String semestre;
	
	public Disciplinas(String nome, int cargaHoraria, String semestre) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.semestre = semestre;
	}

	public void tema() {
		
		System.out.println(" O nome da disciplina é: "+nome);
	}
	
	public void horas() {
		
		System.out.println(" A carga horária desta disciplina é de: "+cargaHoraria);
	}
}
