/**
 * Escreva um programa que receba a idade de 10 pessoas, calcule e imprima
 * a quantidade de pessoas maiores de idade (idade >= 18 anos).
 */

package atividade03_questao02;

import java.util.Scanner;

public class Atividade03_questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int idade;
        int maiores18 = 0;
        
        while (i <= 10) {
            System.out.print("Digite a " + i + "ª idade: ");
            idade = input.nextInt();
            i = i + 1;
            if (idade >= 18) {
                maiores18 = maiores18 + 1;
            }            
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Quantidade de pessoas maior de idade: " + maiores18);
    }   
}
