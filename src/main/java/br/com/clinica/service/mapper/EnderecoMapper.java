package br.com.clinica.service.mapper;

import br.com.clinica.model.Endereco;
import br.com.clinica.model.Paciente;
import br.com.clinica.model.dto.endereco.CadastrarEnderecoDTO;

public final class EnderecoMapper {

	
	private EnderecoMapper() {
		
	}

	public static Endereco mapper(CadastrarEnderecoDTO enderecoDTO, Paciente paciente) {
		Endereco endereco = new Endereco();
		endereco.setCep(enderecoDTO.getCep());
		endereco.setCity(enderecoDTO.getCity());
		endereco.setComplement(enderecoDTO.getComplement());
		endereco.setNeighborhood(enderecoDTO.getNeighborhood());
		endereco.setNumber(enderecoDTO.getNumber());
		endereco.setReferencePoint(enderecoDTO.getReferencePoint());
		endereco.setState(enderecoDTO.getState());
		endereco.setStreet(enderecoDTO.getStreet());
		endereco.setPatient(paciente);
		return endereco;
	}
	
	
}
