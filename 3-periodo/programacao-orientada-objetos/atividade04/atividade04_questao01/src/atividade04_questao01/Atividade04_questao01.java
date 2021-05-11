/*
Faça um programa que receba 10 números inteiros e os armazena em um vetor, 
em seguida calcula e mostra:
a) Os números pares e sua quantidade
b) Os números ímpares e o seu somatório
 */
package atividade04_questao01;

import java.util.Scanner;

public class Atividade04_questao01 {
    
    public static void main(String[] args) {
        int[] valores = new int[10];
        int quantidade_pares = 0;
        int soma_impares = 0;

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um número inteiro: ");
            valores[i] = input.nextInt();
        }
        
        System.out.print("Números pares recebidos: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.print(valores[i] + " ");
                quantidade_pares = quantidade_pares + 1;
            }
            }
        System.out.print("\n");
        System.out.print("Números ímpares recebidos: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 != 0) {
                System.out.print(valores[i] + " ");
                soma_impares = soma_impares + valores[i];
            }
        }
        System.out.print("\n");
        System.out.println("Quantidade de números pares recebidos: " + quantidade_pares);
        System.out.println("Somatório de números ímpares recebidos: " + soma_impares);
        }
}
