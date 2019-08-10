package br.com.clinica.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.clinica.model.enums.EstadoCivilEnum;
import br.com.clinica.model.enums.SexoEnum;

@Entity
@SequenceGenerator(name= "pessoa_seq", sequenceName = "pessoa_seq", allocationSize = 1)
public class Paciente implements Serializable {

	private static final long serialVersionUID = 8802862574226677885L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_seq")
	private Long id;

	private String name;

	private String cpf;

	private String rg;

	private String bloodType;

	private String healthPlan;

	@Column(name = "url_foto")
	private String fotoUrl;

	private String phone;

	private String email;

	private String celphone;

	@Enumerated(EnumType.STRING)
	private SexoEnum sex;

	@Enumerated(EnumType.STRING)
	private EstadoCivilEnum status;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public SexoEnum getSex() {
		return sex;
	}

	public void setSex(SexoEnum sex) {
		this.sex = sex;
	}

	public EstadoCivilEnum getStatus() {
		return status;
	}

	public void setStatus(EstadoCivilEnum status) {
		this.status = status;
	}


	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
