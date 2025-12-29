package com.calltech.my_first_web_api.repository;

import com.calltech.my_first_web_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByUsername(String username);

    Usuario findByEmail(String email);

    Usuario findByNome(String nome);
}