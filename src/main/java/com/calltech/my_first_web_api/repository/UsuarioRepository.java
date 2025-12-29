package com.calltech.my_first_web_api.repository;

import com.calltech.my_first_web_api.handler.CampoObrigatorioException;
import com.calltech.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {

        if (usuario.getSenha() == null || usuario.getSenha().isEmpty()) {
            throw new CampoObrigatorioException("Senha.");
        }

        System.out.println("Salvando usuário: " + usuario);
    }

    public void deleteById(Integer id) {
        System.out.println("Excluindo usuário com id: " + id);
    }

    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("alex", "6556566"));
        usuarios.add(new Usuario("Leandro", "635447"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        return new Usuario("alex", "6556566");
    }

    public Usuario findByUsername(String username) {
        return new Usuario("alex", "6556566");
    }
}