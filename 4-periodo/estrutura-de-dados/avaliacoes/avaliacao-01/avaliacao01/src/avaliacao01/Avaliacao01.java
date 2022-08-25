package avaliacao01;

public class Avaliacao01 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);
        
        System.out.println("-------------------------------------");
        System.out.println("Resolução da 1ª questão:");
        System.out.println("Elementos no vetor: " + vetor.toStringTudo());
        
        vetor.adiciona(0, "Elemento 1");
        vetor.adiciona(1, "Elemento 2");
        vetor.adiciona(2, "Elemento 3");
        vetor.adiciona(3, "Elemento 4");
        
        System.out.println("Elementos no vetor: " + vetor.toStringTudo());
        
        vetor.clear();
        
        System.out.println("Elementos no vetor: " + vetor.toStringTudo());
        
        System.out.println("\n");
        System.out.println("-------------------------------------");
        System.out.println("Resolução da 2ª questão:");
        
        vetor.adiciona(0, "Heraldo");
        vetor.adiciona(1, "Professor bacana");
        vetor.adiciona(2, "Heraldo");
        vetor.adiciona(3, "Professor bacana");
        
        System.out.println("Elementos no vetor: " + vetor.toStringTudo());
        
        vetor.lastIndexOf("Professor bacana");
        
    }
    
}
