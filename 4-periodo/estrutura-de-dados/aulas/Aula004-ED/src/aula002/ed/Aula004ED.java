package aula002.ed;

public class Aula004ED {

    public static void main(String[] args) {
        
        //Criando uma lista vazia
        
        Vetor vetor = new Vetor(6);
        
        vetor.adiciona("Primeiro Elemento");
        vetor.adiciona("Segundo Elemento");
        vetor.adiciona("Terceiro Elemento");

        // System.out.println("------------------------------------------------------");
        // System.out.println("O valor contido nesse índice é: " + vetor.busca(1));
        // System.out.println("------------------------------------------------------");
    
        // System.out.println(vetor.verifica("elemento"));

        //System.out.println(vetor.verifica("terceiro elemento"));

        if(vetor.verifica("terceiro elemento") == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("O índice do elemento informado é: " + vetor.verifica("terceiro elemento"));
        }
    }
    
}
