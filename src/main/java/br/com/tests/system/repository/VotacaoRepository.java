package br.com.tests.system.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tests.system.model.Votacao;

public interface VotacaoRepository extends CrudRepository<Votacao, String> {

}
