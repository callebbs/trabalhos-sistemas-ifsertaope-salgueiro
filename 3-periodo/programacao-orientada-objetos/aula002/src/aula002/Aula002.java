/*
 Aula 002 - Programação Orientada a Objetos
 */
package aula002;

import java.util.Scanner;

public class Aula002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média é " + media);
        
        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado.");
        } else if (media < 4) {
            System.out.println("Infelizmente você foi reprovado.");
        } else {
            System.out.println("Você está em recuperação, estude mais.");
        }
    }
}
