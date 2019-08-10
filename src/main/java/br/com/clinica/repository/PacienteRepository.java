package br.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clinica.model.Paciente;

@Repository
public interface PacienteRepository  extends JpaRepository<Paciente, Long>{

}
