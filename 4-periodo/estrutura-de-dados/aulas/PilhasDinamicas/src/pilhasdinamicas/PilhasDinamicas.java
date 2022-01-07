package pilhasdinamicas;

import java.util.Stack;

public class PilhasDinamicas {

    public static void main(String[] args) {
        /*
        
        Pilha pilha = new Pilha();
        
        System.out.println("A pilha é vazia? " + pilha.isEmpty());
        System.out.println("A pilha é vazia? " + pilha.size());
        pilha.push(15);
        pilha.push(20);
        pilha.push(35);
        pilha.push(40);
        System.out.println("-----------------------------------");
        System.out.println("A pilha é vazia? " + pilha.isEmpty());
        System.out.println("A pilha é vazia? " + pilha.size());
        System.out.println("-----------------------------------");
        System.out.println("Elemento removido do topo: " + pilha.pop());
        System.out.println("Tamanho após a remoção: " + pilha.size());
        System.out.println("Novo topo da pilha: " + pilha.top());
        System.out.println("-----------------------------------");

        */
        
        Stack pilha = new Stack();
        
        System.out.println("A Pilha está vazia? " + pilha.empty());
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(32);
        pilha.push(54);
        pilha.push(74);
        pilha.push(29);
        pilha.push(37);
        
        System.out.println("Tamanho: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Removendo o topo: " + pilha.pop());
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Tamanho: " + pilha.size());
        System.out.println("A Pilha está vazia? " + pilha.empty());
        
        System.out.println("O elemento 54 está na profundidade: " + pilha.search(54));
        
        

    }
    
}
