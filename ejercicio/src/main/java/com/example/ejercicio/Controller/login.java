package com.example.ejercicio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class login {

    @GetMapping("/login")
    public String inicio(){
        return "login";
    }

}
