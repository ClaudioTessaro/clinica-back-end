package br.com.clinica.endpoint;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.clinica.model.Paciente;
import br.com.clinica.model.dto.EntidadeBaseDTO;
import br.com.clinica.model.dto.paciente.CadastrarPacienteDTO;
import br.com.clinica.service.PacienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Paciente controller")
@Controller
@RequestMapping("/paciente")
public class PacienteEndPoint {

	@Autowired
	private PacienteService pacienteService;

	@ApiOperation(value = "Insere uma foto")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Foto incluida com sucesso.") })
	@PostMapping("/foto/{id}")
	public ResponseEntity<Void> uploadProfilePicture(@RequestParam(name = "file") MultipartFile multipartFile, @PathVariable Long id) {
		URI uri = pacienteService.uploadProfilePicture(multipartFile,id);
		return ResponseEntity.created(uri).build();
	}

	@ApiOperation(value = "Busca por id")
	@GetMapping("{id}")
	public ResponseEntity<Paciente> buscarPorId(@PathVariable Long id) {
		return new ResponseEntity<Paciente>(pacienteService.buscarPorId(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Insere um paciente")
	@ApiResponses(value = 
		{ @ApiResponse(code = 201, message = "Paciente cadastrado com sucesso")
		})
	@PostMapping
	public ResponseEntity<EntidadeBaseDTO> cadastrarPaciente(@RequestBody CadastrarPacienteDTO cadastrarPacienteDTO){
		Paciente paciente = pacienteService.savePaciente(cadastrarPacienteDTO);
		return new ResponseEntity<>(pacienteService.retornoPeloId(paciente), HttpStatus.CREATED);
	}

}
