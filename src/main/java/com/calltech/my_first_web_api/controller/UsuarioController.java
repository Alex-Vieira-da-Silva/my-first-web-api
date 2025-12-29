package com.calltech.my_first_web_api.controller;

import com.calltech.my_first_web_api.model.Usuario;
import com.calltech.my_first_web_api.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private IUsuarioRepository repository;

    @GetMapping
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public Usuario getOne(@PathVariable String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('MANAGERS')")
    public void deleteUser(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('MANAGERS')")
    public void createUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('MANAGERS')")
    public void updateUser(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        repository.save(usuario);
    }
}