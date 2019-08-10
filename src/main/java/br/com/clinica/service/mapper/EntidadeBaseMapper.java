package br.com.clinica.service.mapper;

import br.com.clinica.model.Paciente;
import br.com.clinica.model.dto.EntidadeBaseDTO;

public final class EntidadeBaseMapper {
	
	private EntidadeBaseMapper() {
		
	}

	public static EntidadeBaseDTO mapper(Paciente paciente) {
		EntidadeBaseDTO baseDTO = new EntidadeBaseDTO();
		baseDTO.setId(paciente.getId());
		return baseDTO;
	}
	
	

}
