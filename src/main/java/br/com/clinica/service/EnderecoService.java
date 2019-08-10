package br.com.clinica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clinica.model.Endereco;
import br.com.clinica.model.Paciente;
import br.com.clinica.model.dto.endereco.CadastrarEnderecoDTO;
import br.com.clinica.repository.EnderecoRepository;
import br.com.clinica.service.mapper.EnderecoMapper;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private PacienteService pacienteService;

	public Endereco cadastrarEndereco(CadastrarEnderecoDTO enderecoDTO) {
		Paciente paciente = pacienteService.buscarPorId(enderecoDTO.getIdPatient());
		Endereco endereco = EnderecoMapper.mapper(enderecoDTO, paciente);
		return enderecoRepository.save(endereco);

	}

}
