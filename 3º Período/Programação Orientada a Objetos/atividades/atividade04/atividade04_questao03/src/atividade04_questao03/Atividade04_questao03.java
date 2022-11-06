/*
Desenvolva um programa que leia elementos inteiros do teclado para uma matriz 4x4 
e em seguida apresenta todos os elementos, exceto os da diagonal principal.
 */
package atividade04_questao03;

import java.util.Scanner;

public class Atividade04_questao03 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[4][4];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite os valores da Matriz 4x4: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.print("Linha " + linha + " Coluna " + col + ": ");
                matriz[linha][col] = input.nextInt();
            }
            }
        
        System.out.println("Matriz recebida sem a diagonal principal: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int col = 0; col < matriz.length; col++) {
                if (matriz[linha][col] != matriz[0][0] 
                        && matriz[linha][col] != matriz[1][1] 
                        && matriz[linha][col] != matriz[2][2] 
                        && matriz[linha][col] != matriz[3][3]) {
                    System.out.print(matriz[linha][col] + " ");
                }
        }
            System.out.println("");
        }
    }
}