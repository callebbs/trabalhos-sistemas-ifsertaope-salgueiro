/*
 * Array
 */
package aula003.pkg1;

import java.util.Scanner;

public class Aula0031 {

    public static void main(String[] args) {
        // Array - Vetor e Matriz
        // int[] valores, variavel1, variavel2 - Cria vários arrays
        // ou int valores[];
        int[] valores = new int[10];
        
        /*
        valores[0] = 25;
        valores[1] = 5;
        valores[2] = 47;
        valores[3] = 89;
        // último índice
        valores[9] = 77;
        */
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite um número:");
            valores[i] = input.nextInt();
        }
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println( valores[i] );
        }
        
    }
    
}
