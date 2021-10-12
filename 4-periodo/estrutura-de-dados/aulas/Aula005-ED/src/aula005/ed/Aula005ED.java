package aula005.ed;

public class Aula005ED {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        
    
//        vetor.adicionaUltimaPosicao("Primeiro elemento");
//        vetor.adicionaUltimaPosicao("Segundo elemento");
//        vetor.adicionaUltimaPosicao("Terceiro elemento");
        
//        System.out.println(vetor.toStringTudo());
//        
//        vetor.adiciona(0, "Novo elemento");
        
        
//        System.out.println(vetor.toStringTudo());

        vetor.adiciona(0, "novo elemento");
        vetor.adiciona(0, "teste2");
        vetor.adiciona(0, "teste3");
        vetor.adiciona(0, "teste4");
        vetor.adiciona(0, "teste5");
        vetor.adiciona(0, "teste6");
        vetor.adiciona(5, "teste7");
        
        System.out.println(vetor.toStringTudo());
        
        
    }
}