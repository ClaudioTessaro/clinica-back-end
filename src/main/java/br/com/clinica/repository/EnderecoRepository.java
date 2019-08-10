package br.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinica.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
