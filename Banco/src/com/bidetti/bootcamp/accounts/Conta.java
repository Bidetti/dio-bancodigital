package com.bidetti.bootcamp.accounts;

import com.bidetti.bootcamp.accounts.interfaces.IConta;
import com.bidetti.bootcamp.user.Cliente;

public class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA = 1;

    private Banco banco;

    private int agencia;
    private int numero;
    protected String type;
    protected double saldo;


    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Conta() {
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s\n" +
                "Agencia: %d\n" +
                "Conta: %d\n" +
                "Saldo: %.2f", this.cliente.getNome(), this.agencia, this.numero, this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getType() {
        return type;
    }

}
