package br.com.clinica.model.dto;

import java.io.Serializable;

public class EntidadeBaseDTO implements Serializable {

	private static final long serialVersionUID = -3396197143874374421L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
