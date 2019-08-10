package br.com.clinica.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.clinica.model.Paciente;
import br.com.clinica.model.dto.EntidadeBaseDTO;
import br.com.clinica.model.dto.paciente.CadastrarPacienteDTO;
import br.com.clinica.repository.PacienteRepository;
import br.com.clinica.service.mapper.EntidadeBaseMapper;
import br.com.clinica.service.mapper.PacienteMapper;

@Service
public class PacienteService {

	@Autowired
	private S3Service s3Service;

	@Autowired
	private PacienteRepository pacienteRepository;

	public URI uploadProfilePicture(MultipartFile multipartFile, Long id) {
		URI uri = s3Service.uploadFile(multipartFile);
		Paciente paciente = buscarPorId(id);
		paciente.setFotoUrl(uri.toString());
		pacienteRepository.save(paciente);
		return uri;

	}

	public Paciente buscarPorId(Long id) {
		return pacienteRepository.findById(id).get();
	}

	public Paciente savePaciente(CadastrarPacienteDTO pacienteDTO) {
		Paciente paciente = PacienteMapper.mapper(pacienteDTO);
		return pacienteRepository.save(paciente);

	}

	public EntidadeBaseDTO retornoPeloId(Paciente paciente) {
		EntidadeBaseDTO baseDTO = EntidadeBaseMapper.mapper(paciente);
		return baseDTO;
	}

}
