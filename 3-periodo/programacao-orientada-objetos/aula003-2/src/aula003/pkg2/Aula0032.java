package aula003.pkg2;

import java.util.Scanner;

public class Aula0032 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int imagem[][] = new int[3][2];
        
        imagem[0][1] = 50;
        imagem[1][1] = 76;
        
        for (int lin = 0; lin < imagem.length; lin++) {
            for (int col = 0; col < imagem[lin].length; col++) {
                System.out.print("Digite o número para posição ["+lin+"]["+col+"]: ");
                imagem[lin][col] = input.nextInt();
                
            }
        }
        
        for (int lin = 0; lin < imagem.length; lin++) {
            for (int col = 0; col < imagem[lin].length; col++) {
                System.out.print(imagem[lin][col] + " ");
                
            }
            System.out.println(" ");
        }
    }
    
}
