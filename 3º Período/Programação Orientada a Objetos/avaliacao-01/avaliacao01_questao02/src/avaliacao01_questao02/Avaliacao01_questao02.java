package avaliacao01_questao02;

import java.util.Scanner;

public class Avaliacao01_questao02 {


    public static void main(String[] args) {
        double valor;
        Scanner input = new Scanner(System.in);
        
        ContaCorrente conta1 = new ContaCorrente();
        ClienteEspecial conta2 = new ClienteEspecial();
        
        System.out.println("Seu saldo é: " + conta1.verificarSaldo());
        
        conta1.depositar();
        
        System.out.println("Seu saldo é: " + conta1.verificarSaldo());
        
        System.out.print("Digite um valor para saque: ");
        valor = input.nextDouble();
        conta1.sacar(valor);
        
        System.out.println("Seu saldo é: " + conta1.verificarSaldo());
        
        // Cliente Especial
        System.out.println("Cliente Especial");
        System.out.println("Seu saldo é: " + conta2.verificarSaldo());
        conta2.depositar();
        System.out.println("Seu saldo é: " + conta2.verificarSaldo());
        
        System.out.print("Digite um valor para saque: ");
        valor = input.nextDouble();
        conta2.sacar(valor);
        System.out.println("Seu saldo é: " + conta2.verificarSaldo());
    }
    
}
