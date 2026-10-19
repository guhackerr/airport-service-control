package br.com.kelvyn.sistemacadastro.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.kelvyn.sistemacadastro.database.model.Aircraft;

public interface AircraftRepository extends JpaRepository<Aircraft, String> {

}