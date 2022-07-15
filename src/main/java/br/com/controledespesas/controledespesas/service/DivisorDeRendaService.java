package br.com.controledespesas.controledespesas.service;

import br.com.controledespesas.controledespesas.service.strategy.IDivisorDeRendaServiceStrategy;

public class DivisorDeRendaService {
    private IDivisorDeRendaServiceStrategy divisorStrategy;

    public DivisorDeRendaService() {
    }

    public void setDivisorStrategy(IDivisorDeRendaServiceStrategy divisorStrategy) {
        this.divisorStrategy = divisorStrategy;
    }

    public void dividirRenda(String renda, String idDivisor){
        //TODO Criar metodo para definir qual das 'strategies' a partir do id e settar
        //TODO executar metodo do "divisorStrategy'
    }
}
