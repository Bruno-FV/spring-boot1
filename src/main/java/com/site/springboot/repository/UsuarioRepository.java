package com.site.springboot.repository;


import com.site.springboot.model.Usuario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    @Query(value="select * from usuario where email = :email and senha = :senha", nativeQuery = true)
    public Usuario login(String email, String senha);
   
}
