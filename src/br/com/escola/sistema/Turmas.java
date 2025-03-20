package br.com.escola.sistema;

public class Turmas {

	public String codigoTurma;
	public String periodoEstudo;
	public String sala;
	
	public Turmas(String codigoTurma, String periodoEstudo, String sala) {
		super();
		this.codigoTurma = codigoTurma;
		this.periodoEstudo = periodoEstudo;
		this.sala = sala;
	}

	
	public void alocada() {
		
		System.out.println(" Está alocada na sala: "+sala);
		
	}
	
	public void registro() {
		
		System.out.println(" A turma foi registrada com o seguinte código: "+codigoTurma);
		
	}
}
