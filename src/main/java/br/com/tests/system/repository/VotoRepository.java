package br.com.tests.system.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tests.system.model.Voto;

public interface VotoRepository extends CrudRepository<Voto, String>{

}
