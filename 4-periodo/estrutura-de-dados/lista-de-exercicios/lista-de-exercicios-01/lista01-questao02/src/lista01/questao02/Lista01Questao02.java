package lista01.questao02;

public class Lista01Questao02 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);
        
        vetor.adiciona(0, "elemento 1");
        vetor.adiciona(1, "elemento 2");
        vetor.adiciona(2, "elemento 3");
        
            
        System.out.println("Elementos no vetor: " + vetor.toStringTudo());
        
        vetor.removeElementos("elemento 0");
        
        System.out.println("Elementos no vetor: " + vetor.toStringTudo());
        
        vetor.buscaIndice("elemento 3");
    }
    
}
