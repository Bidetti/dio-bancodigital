package com.bidetti.bootcamp.accounts.types;

import com.bidetti.bootcamp.accounts.Conta;
import com.bidetti.bootcamp.user.Cliente;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
         super.type = "Corrente";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente - Extrato ===");
        super.imprimirInfosComuns();
    }
}
