package com.bidetti.bootcamp;

import com.bidetti.bootcamp.accounts.Banco;
import com.bidetti.bootcamp.accounts.Conta;
import com.bidetti.bootcamp.accounts.types.ContaCorrente;
import com.bidetti.bootcamp.accounts.types.ContaPoupanca;
import com.bidetti.bootcamp.user.Cliente;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente c1 = new Cliente();
        c1.setNome("Rafael ");
        Conta cc = new ContaCorrente(c1);
        cc.depositar(200);
        Conta cp = new ContaPoupanca(c1);
        cc.transferir(100, cp);
        banco.setConta(cc);
        banco.setConta(cp);

        banco.getContas();

    }
}
