package br.com.escola.main;
import br.com.escola.sistema.Alunos;
import br.com.escola.sistema.Disciplinas;
import br.com.escola.sistema.Professores;
import br.com.escola.sistema.Turmas;

public class Main {

	public static void main(String[] args) {
		
		Professores objProfessores = new Professores("Wesley", "Filosofia", 2010);
		Alunos objAlunos = new Alunos("Izadora Belfort Rodrigues", 16, "UC24201506", "Matutino", 7.5 );
		Disciplinas objDisciplinas = new Disciplinas("Filosofia", 80, "Primeiro");
		Turmas objTurmas = new Turmas("M3C2OP8", "Vespertino","C208");
		
		objProfessores.leciona();
		objProfessores.participa();
		
		
		objAlunos.estuda();
		objAlunos.avalia(7.5);
		
		objDisciplinas.horas();
		objDisciplinas.tema();
		
		objTurmas.alocada();
		objTurmas.registro();
	}
}
