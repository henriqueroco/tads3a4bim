package br.com.feltex.academicnet.entidade;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long matricula;
	private String nome;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
