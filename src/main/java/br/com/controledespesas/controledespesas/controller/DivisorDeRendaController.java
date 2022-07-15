package br.com.controledespesas.controledespesas.controller;

import br.com.controledespesas.controledespesas.service.DivisorDeRendaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dividir-renda")
public class DivisorDeRendaController {
    private DivisorDeRendaService divisorService = new DivisorDeRendaService();

    @GetMapping("/padrao/{renda}/{id}")
    public void dividirRenda(@PathVariable("renda") String renda, @PathVariable("id") String id){

    }
}
