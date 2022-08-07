package com.bidetti.bootcamp.accounts.interfaces;

import com.bidetti.bootcamp.accounts.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
