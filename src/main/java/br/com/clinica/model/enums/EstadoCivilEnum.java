package br.com.clinica.model.enums;

public enum EstadoCivilEnum {
	
	C("casado"),
	S("solteiro"),
	D("divorciado");
	
	private String desc;
	
	private EstadoCivilEnum(String desc) {
		this.desc = desc;
	
	}

	public String getDesc() {
		return desc;
	}
	
}
