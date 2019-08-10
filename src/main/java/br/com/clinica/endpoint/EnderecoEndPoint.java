package br.com.clinica.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.clinica.model.Endereco;
import br.com.clinica.model.dto.endereco.CadastrarEnderecoDTO;
import br.com.clinica.service.EnderecoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Paciente controller")
@Controller
@RequestMapping("/endereco")
public class EnderecoEndPoint {

	@Autowired
	private EnderecoService enderecoService;


	@ApiOperation(value = "Insere um endereco")
	@ApiResponses(value = 
		{ @ApiResponse(code = 201, message = "Endereco cadastrado com sucesso")
		})
	@PostMapping
	public ResponseEntity<Endereco> cadastrarEndereco(@RequestBody CadastrarEnderecoDTO cadastrarEndereco){
		return new ResponseEntity<>(enderecoService.cadastrarEndereco(cadastrarEndereco), HttpStatus.CREATED);
	}

}
