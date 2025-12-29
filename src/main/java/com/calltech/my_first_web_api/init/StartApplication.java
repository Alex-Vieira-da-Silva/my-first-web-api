package com.calltech.my_first_web_api.init;

import com.calltech.my_first_web_api.model.Usuario;
import com.calltech.my_first_web_api.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    private IUsuarioRepository repository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        // Criar ADMIN
        Usuario admin = repository.findByUsername("admin");
        if (admin == null) {
            admin = new Usuario();
            admin.setNome("ADMIN");
            admin.setUsername("admin");
            admin.setEmail("admin@admin.com");
            admin.setSenha("master123");
            admin.getRoles().add("MANAGERS");
            repository.save(admin);
        }

        // Criar USER
        Usuario user = repository.findByUsername("user");
        if (user == null) {
            user = new Usuario();
            user.setNome("USER");
            user.setUsername("user");
            user.setEmail("user@user.com");
            user.setSenha("user123");
            user.getRoles().add("USERS");
            repository.save(user);
        }
    }
}
