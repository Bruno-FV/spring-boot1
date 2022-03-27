package com.site.springboot.controllers;

import com.site.springboot.model.Usuario;
import com.site.springboot.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CadLoginController {

    @Autowired
    private UsuarioRepository novoCadLogin;


    @GetMapping("/cadLogin")
    public String login(){        
        return "cadastroLogin/cadLogin";
    }
    
    @PostMapping("/cadLogin")
    public String formCadLogin(Usuario usuario){
        novoCadLogin.save(usuario);
        return "cadastroLogin/cadLogin";
    }
    
}
