package com.example.Actividad2Sergio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActividadController {

    public List<Coche> coches = new ArrayList<>();

    public ActividadController() {
        // Initialize the list of Coche objects in the constructor
        Coche ferrari = new Coche("15F1JG1", "Ferrari", "Uno caro", 5990);
        Coche dacia = new Coche("H2KH164", "Dacia", "Sandero", 999999);
        Coche abutarda = new Coche("420BLAZE", "Tesla", "Catorce", 42069);

        coches.add(ferrari);
        coches.add(dacia);
        coches.add(abutarda);
    }

    @GetMapping("/")
    String index(Model model){
        model.addAttribute("coches",coches);
        return "index";
    }

    @PostMapping("/nuevo")
    public String añadirCoche(Model model,Coche coche) {
        coches.add(coche);
        model.addAttribute("coches",coches);
        return "nuevo";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoCoche() {
        return "nuevo";
    }
}

