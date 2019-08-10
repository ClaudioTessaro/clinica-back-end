package br.com.clinica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name= "endereco_seq", sequenceName = "endereco_seq", allocationSize = 1)
public class Endereco implements Serializable{

	private static final long serialVersionUID = 2637837522253540195L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_seq")
	private Long id;
	
	private String street;
	
	private String cep;
	
	private String state;
	
	private String city;
	
	private String neighborhood;
	
	private Integer number;
	
	private String complement;
	
	private String referencePoint;
	
	@OneToOne
	@JoinColumn(name = "id_patient")
	private Paciente patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getReferencePoint() {
		return referencePoint;
	}

	public void setReferencePoint(String referencePoint) {
		this.referencePoint = referencePoint;
	}

	public Paciente getPatient() {
		return patient;
	}

	public void setPatient(Paciente patient) {
		this.patient = patient;
	}
	
}
