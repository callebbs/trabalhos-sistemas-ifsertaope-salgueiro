package atividade06_questao08;

import java.util.Scanner;

public class Atividade06_questao08 {
    
    static int numero1, numero2;
    static boolean verificacao;

    public static void main(String[] args) {
        
        Matematica matematica = new Matematica();
        Scanner input = new Scanner(System.in);
        
        System.out.println(":: Programa de Números Múltiplos ::");
        System.out.print("Digite um número: ");
        numero1 = input.nextInt();
        System.out.print("Digite outro número para verificar se é múltiplo de " + numero1 + " : ");
        numero2 = input.nextInt();
        
        verificacao = matematica.isMultiplo(numero1, numero2);
        
        System.out.println("O número " + numero1 + " é múltiplo de " + numero2 + "? " + verificacao);
    }
    
}
