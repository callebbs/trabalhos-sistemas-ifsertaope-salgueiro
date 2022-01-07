package lista.de.exercicios.pkg03;

import java.util.Arrays;
import java.util.Scanner;

public class ListaDeExercicios03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ordenacao ordena = new Ordenacao();
        
        String[] vetorNomes = new String[5];
        
        System.out.println("---------------------------------");
        System.out.println("Questão 01:");
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        
        String[] fraseSeparada = frase.split("");
        ordena.setVetorPalavras(fraseSeparada);
        ordena.quickSortString(ordena.getVetorPalavras(), 0, ordena.getVetorPalavras().length-1);
        
        System.out.println("Letras da frase em ordem alfabética: ");
        System.out.println(Arrays.toString(ordena.getVetorPalavras()));
        
        System.out.println("---------------------------------");
        System.out.println("Questão 02");
        
        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.print("Digite um nome: ");
            vetorNomes[i] = input.nextLine();
        }
        
        ordena.insertionSort(vetorNomes);
        System.out.println("Nomes do menor para o maior: ");
        for(String v: vetorNomes) {
            System.out.print(v + ", ");
        }
       
    }
    
}
