package br.com.clinica.endpoint.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

	private static final long serialVersionUID = 2836516589571318256L;
	
	private List<FieldMessage> list = new ArrayList<>();
	
	
	public ValidationError(Integer status, String msg) {
		super(status, msg);
	}
	
	public List<FieldMessage> getErrors() {
		return list;
	}

	public void addError(String fieldName, String messagem) {
		list.add(new FieldMessage(fieldName, messagem));
	}

}
