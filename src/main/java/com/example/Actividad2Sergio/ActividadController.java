package com.example.Actividad2Sergio;

import org.springframework.web.bind.annotation.GetMapping;

public class ActividadController {
    @GetMapping("/")
    String index(){
        return "index";
    }

    @GetMapping("/nuevo")
    String nuevo(){
        return "nuevo";
    }
}
