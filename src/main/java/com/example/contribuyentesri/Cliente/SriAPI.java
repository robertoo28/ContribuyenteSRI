package com.example.contribuyentesri.Cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "SRI", url = "https://srienlinea.sri.gob.ec/sri-catastro-sujeto-servicio-internet/rest/ConsolidadoContribuyente")
public interface SriAPI {

    @GetMapping("/existePorNumeroRuc?numeroRuc={cedula}")
    Boolean contribuye(@PathVariable String cedula);
}
