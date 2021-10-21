package aula007.ed;

import java.util.ArrayList;

public class Aula007ED {

    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList();
        
        arraylist.add("X");
        arraylist.add("Y");
        arraylist.add(0, "A");
        
        System.out.println(arraylist);
        
        System.out.println("---------------------------------");
        
        boolean existe = arraylist.contains("Y");
        
        if (existe) {
            System.out.println("O elemento está contido no vetor.");
        } else {
            System.out.println("O elemento NÃO está contido no vetor.");
        }
        
        System.out.println("---------------INDEX OF------------------");
        
        int posicao = arraylist.indexOf("X");
        
        if (posicao > -1) {
            System.out.println("O elemento está contido no vetor na posição: " + posicao);
        } else {
            System.out.println("O elemento não está contido no vetor.");
        }
        
        System.out.println("---------------GET------------------");
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.get(0));
        
        System.out.println("---------------REMOVE------------------");
        
        arraylist.remove("X");
        System.out.println(arraylist);
        
        System.out.println("---------------SIZE------------------");
        
        System.out.println("O tamanho do nosso vetor é: " + arraylist.size());
    }
    
}
