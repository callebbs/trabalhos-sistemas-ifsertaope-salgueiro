package atividade01.ed;


public class Atividade01Ed {

    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("João");
        vetor.adiciona("Pedro");
        vetor.adiciona("Jéssica");
        vetor.adiciona("Matheus");
        
        System.out.println(vetor.toString());
    }
    
}
