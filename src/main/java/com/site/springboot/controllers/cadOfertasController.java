package com.site.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadOfertasController {

    @GetMapping("/cadastroOfertas")
    public String ofertas(){

        return "cadastroOfertas/cadastroOfertas";
    }
    
}
