package br.com.clinica.service.mapper;

import br.com.clinica.model.Paciente;
import br.com.clinica.model.dto.paciente.CadastrarPacienteDTO;
import br.com.clinica.model.enums.EstadoCivilEnum;
import br.com.clinica.model.enums.SexoEnum;

public final class PacienteMapper {
	
	private PacienteMapper() {
		
	}

	public static Paciente mapper(CadastrarPacienteDTO pacienteDTO) {
		Paciente paciente = new Paciente();
		
		paciente.setBloodType(pacienteDTO.getBloodType());
		paciente.setName(pacienteDTO.getName());
		paciente.setCpf(pacienteDTO.getCpf());
		paciente.setDateBirth(pacienteDTO.getDateBirth());
		paciente.setHealthPlan(pacienteDTO.getHealthPlan());
		paciente.setRg(pacienteDTO.getRg());
		paciente.setSex(SexoEnum.valueOf(pacienteDTO.getSex()));
		paciente.setStatus(EstadoCivilEnum.valueOf(pacienteDTO.getStatus()));
		paciente.setCelphone(pacienteDTO.getCelphone());
		paciente.setEmail(pacienteDTO.getEmail());
		paciente.setPhone(pacienteDTO.getPhone());
		return paciente;
	}



}
