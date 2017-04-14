package cursos;

import java.util.Date;

public class Turma {
	private int numero ;
	private Date dataInicio;
	private Turno turno;
	private Curso curso;
	private Aluno[] alunos;
	
	private int posicao =0;
	
	public Turma(int tamanho) {
		alunos=  new Aluno[tamanho];
	}



	public void adicionarAluno (Aluno aluno){
		if(posicao < alunos.length){
			alunos[posicao++] = aluno;
		}
	}


	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}



	public Aluno getAluno(int i) {
		
		return alunos[i];
	}
	
	
}
