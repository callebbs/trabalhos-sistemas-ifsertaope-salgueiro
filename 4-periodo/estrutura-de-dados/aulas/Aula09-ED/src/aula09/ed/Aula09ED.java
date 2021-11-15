package aula09.ed;

import java.util.Scanner;

public class Aula09ED {

    public static void main(String[] args) {
        int[] vetor = new int[4];
        
//        Scanner ler = new Scanner(System.in);
//        
//        for (int i = 0; i < 4; i++) {
//            System.out.print("Informe o número da posição: " + i + ": ");
//            vetor[i] = ler.nextInt();
//        }
//        
//        System.out.println("Vetor atual: ");
//        //Imprimindo o vetor desorganizado
//        for(int v : vetor ) {
//            System.out.print(v+ " ");
//        }
//        
//        Ordenacao ordena = new Ordenacao();
//        
//        ordena.bubbleSort(vetor);
//        
//        System.out.println("\nOrganizado pelo Bubble Sort:");
//        
//        //Imprimindo o vetor organizado pelo bubbleSort
//        
//         for(int v : vetor ) {
//            System.out.print(v + " ");
//        }
         
        // Testando a classe Animal

        Animal[] animais = new Animal[4];
        
        Animal bidu = new Animal("Bidu", "Cachorro");
        Animal nina = new Animal("Nina", "Gato");
        Animal enzo = new Animal("Enzo", "Peixe");
        Animal valentina = new Animal("Valentina", "Cabra");
        
        animais[0] = valentina;
        animais[1] = nina;
        animais[2] = enzo;
        animais[3] = bidu;
        
        System.out.println("Vetor desorganizado: ");
        
        for(Animal a : animais ) {
            System.out.print("(" + a.getNome() + " - " + a.getEspecie() + ")");
        }
        
        Ordenacao ordena = new Ordenacao();
        
        ordena.bubbleSortNome(animais);
        
        
        System.out.println("\nVetor organizado pelo Bubble Sort");
        for(Animal a : animais ) {
            System.out.print("(" + a.getNome() + " - " + a.getEspecie() + ")");
        }
    }
    
}
