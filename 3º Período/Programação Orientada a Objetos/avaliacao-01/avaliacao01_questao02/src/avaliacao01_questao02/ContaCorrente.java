package avaliacao01_questao02;

import java.util.Scanner;

public class ContaCorrente {
    double saldo = 0;
    double valor;
    double saque;
    double taxaSaque = 0.5;
    double valorTaxa;
    Scanner input = new Scanner(System.in);
    
    public double verificarSaldo() {
        return saldo;
    }
    
    public void depositar() {
        System.out.print("Digite o valor para depósito: ");
        saldo = saldo + input.nextDouble();
        System.out.println("Depósito concluído");
    }
    
    public void sacar(double valor) {
        valorTaxa = valor * taxaSaque;
        System.out.println("Taxa do saque: " + valorTaxa);
        saque = valor + valorTaxa;
              
        if (saque > saldo) {
            System.out.println("Você não tem saldo suficiente para este saque.");
        } else {
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso.");
        }
    }
    
    
         
}
