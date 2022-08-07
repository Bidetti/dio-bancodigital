package com.bidetti.bootcamp.accounts.types;

import com.bidetti.bootcamp.accounts.Conta;
import com.bidetti.bootcamp.user.Cliente;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.type = "Poupanca";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Poupanca - Extrato ===");
        super.imprimirInfosComuns();
    }

}
