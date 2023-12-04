package com.example.contribuyentesri.Controlador;

import com.example.contribuyentesri.Cliente.SriAPI;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/api")

public class ContribuyenteController {

    @Autowired
    private SriAPI aplicacion;

    @GetMapping ("/existePorNumeroRuc")
    public boolean contribuye(@RequestParam String numeroRuc){
        try {
            boolean p = aplicacion.contribuye(numeroRuc);
            return p;
        } catch (Exception e ){
            System.out.println("Error");

            return false;
        }
    }

}
