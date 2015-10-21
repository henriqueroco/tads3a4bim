package br.com.feltex.academicnet.mdb;

import java.io.Serializable;

import br.com.feltex.academicnet.entidade.Aluno;

public class ObjectMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Aluno object;

	public Aluno getObject() {
		return object;
	}

	public void setObject(Aluno object) {
		this.object = object;
	}
}
