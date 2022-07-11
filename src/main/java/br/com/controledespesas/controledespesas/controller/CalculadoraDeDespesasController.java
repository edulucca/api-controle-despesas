package br.com.controledespesas.controledespesas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora-despesas")
public class CalculadoraDeDespesasController {
    //TODO
    @GetMapping("/bem-vindo")
    public String bemVindo(){
        return "Hello World!";
    }
}
