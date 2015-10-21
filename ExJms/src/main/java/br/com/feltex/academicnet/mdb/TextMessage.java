package br.com.feltex.academicnet.mdb;

import java.io.Serializable;

public class TextMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private Message menssage;

	public Message getMenssage() {
		return menssage;
	}

	public void setMenssage(Message menssage) {
		this.menssage = menssage;
	}

}
