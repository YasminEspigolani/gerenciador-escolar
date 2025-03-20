package br.com.escola.sistema;

public class Alunos {
	
	public String nomeCompleto;
	public int idade;
	public String numeroMatricula;
	public String periodoEstudo;
	public double nota;
	
	public Alunos(String nomeCompleto, int idade, String numeroMatricula, String periodoEstudo, double nota) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.numeroMatricula = numeroMatricula;
		this.periodoEstudo = periodoEstudo;
		this.nota = nota;
	}
	
	public void estuda() {
		
		System.out.println("O aluno estuda no período: "+periodoEstudo);
	}
	
	public void avalia(double nota) {
		
		if (nota >= 7.0) {
			
			System.out.println(" O aluno tirou na avaliação: "+nota);
			System.out.println(" Ele foi aprovado!");
		} else {
			
			System.out.println(" O aluno tirou na avaliação: "+nota);
			System.out.println(" Ele precisará fazer a prova substitutiva");
		}
	}
}
