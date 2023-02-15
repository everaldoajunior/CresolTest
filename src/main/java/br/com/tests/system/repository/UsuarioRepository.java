package br.com.tests.system.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tests.system.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
