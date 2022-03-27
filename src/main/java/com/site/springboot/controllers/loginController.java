package com.site.springboot.controllers;

import com.site.springboot.model.Usuario;
import com.site.springboot.repository.UsuarioRepository;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

    @Autowired
    private UsuarioRepository novo;
    
    @GetMapping("/login")
    public String login(){        
        return "/login/login";
    }
    @PostMapping("/login")
    public String logar(Model model, Usuario admParam){
        Usuario adm = this.novo.login(admParam.getEmail(), admParam.getSenha());  
        if(adm != null){
            return "redirect:/cadastroUnidades";
        }else{
            model.addAttribute("erro", "email ou senha inválidos");

            return "login/login";
        }
        

        
    }


    
}
