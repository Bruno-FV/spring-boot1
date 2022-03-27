package com.site.springboot.controllers;

import org.apache.tomcat.util.buf.StringCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadUnidadesController {

    @GetMapping("/cadastroUnidades")
    public String cadUnidades(){

        return "/cadastroUnidades/cadastroUnidades";
    }
    
}
