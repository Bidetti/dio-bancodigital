package com.bidetti.bootcamp.accounts;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public void getContas() {
        contas.forEach((c) -> {
            System.out.println(String.format("Titular: %s\nAgencia: %d\nConta: %d\nTipo de Conta: %s\nSaldo: %.2f", c.cliente.getNome(), c.getAgencia(), c.getNumero(), c.getType(), c.getSaldo()));
        });
    }
}
