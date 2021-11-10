package lista.exercicios.pkg02;

import java.util.ArrayList;

public class ListaExercicios02 {

    public static void main(String[] args) {
        ArrayList times = new ArrayList();
        
        System.out.println("Adicionando times ao ArrayList...");
        
        times.add("VASCO");
        times.add("FLAMENGO");
        times.add("FLUMINENSE");
        times.add("BOTAFOGO");
        
        System.out.println("Times adicionados.");
        
        System.out.println("ArrayList:");
        System.out.println(times.toString());
        
        String elemento = "BOTAFOGO";
        
        System.out.println("Buscando pelo elemento " + elemento);
        
        if(times.contains(elemento) == true) {
            System.out.println("Elemento encontrado.");
        } else {
            System.out.println("Elemento não encontrado.");
        }
        
        System.out.println("Buscando elemento no ídice 1:");
        System.out.println(times.get(1));
    
        System.out.println("Removendo elemento no índice 2:");
        times.remove(2);
        
        System.out.println(times.toString());
    }
    
}
