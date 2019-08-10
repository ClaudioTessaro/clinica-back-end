package br.com.clinica.model.dto.paciente;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CadastrarPacienteDTO implements Serializable {

	private static final long serialVersionUID = 3561061942035870675L;

	private String name;

	private String cpf;

	private String rg;

	private String bloodType;

	private String healthPlan;

	private String sex;

	private String status;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateBirth;

	private String phone;

	private String email;

	private String celphone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(String healthPlan) {
		this.healthPlan = healthPlan;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelphone() {
		return celphone;
	}

	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}
	
	

}
