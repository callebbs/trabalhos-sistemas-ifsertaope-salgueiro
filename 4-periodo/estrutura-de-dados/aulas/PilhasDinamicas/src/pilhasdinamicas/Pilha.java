package pilhasdinamicas;

public class Pilha {
    private No topo;
    private int tamanho;
    
    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }
    
    // Insere na pilha
    public void push(Object elemento) {
        No novo = new No(elemento, this.topo);
        this.topo = novo;
        this.tamanho++;
    }
    
    public boolean isEmpty() {
        return this.topo == null;
    }
    
//    public int size() {
//        return this.tamanho;
//    }
    
    public int size() {
        if(this.topo == null) {
            return 0;
        }
        No atual = this.topo;
        int contador = 0;
        
        while(atual != null) {
            contador++;
            atual = atual.getProximo();
        }
        return contador;
    } 
    
    public Object top() {
        return this.topo.getElemento();
    }
    
    public Object pop() {
        if(!isEmpty()) {
          Object elementoTopo = this.topo.getElemento();
          this.topo = this.topo.getProximo();
          this.tamanho--;
          return elementoTopo;
        }
        return null;
    }
    
}
