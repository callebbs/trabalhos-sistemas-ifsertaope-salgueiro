package pilhaaula;

public class PilhaAula {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        
        pilha.push(14);
        pilha.push(20);
        pilha.push(3);
        pilha.push(52);
        
        System.out.println("Tamanho da Pilha: " + pilha.size());
        
        if(pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha não está vazia.");
        }
        
        System.out.println("O elemento do topo é: " + pilha.top());
        
        System.out.println("--------------------");
        System.out.println("Remoção do topo: " + pilha.pop());
        System.out.println("O elemento do topo é: " + pilha.top());
        
        System.out.println("--------------------");
        pilha.pop2();
        System.out.println("O elemento do topo é: " + pilha.top());
    }
    
}
