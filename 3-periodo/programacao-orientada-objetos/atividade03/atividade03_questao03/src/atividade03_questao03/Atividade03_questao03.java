/*
Faça um programa que receba um número inteiro positivo N e mostre na tela 
a seguinte sequência de números:
1
2 2
3 3 3
4 4 4 4
.
.
.
n n n n ... n
*/
package atividade03_questao03;

import java.util.Scanner;

public class Atividade03_questao03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        
        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
        
    }
    
}
