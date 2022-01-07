package pilhaaula;

public class Pilha {
    private Object elementos[];
    private int topo;
    
    public Pilha(int capacidade) {
        this.topo = -1;
        this.elementos = new Object[capacidade];
    }
    
    public boolean push(Object elemento) {
        if (this.topo < this.elementos.length-1) {
            this.topo++;
            this.elementos[topo] = elemento;
            return true;
        }
        return false;
    }
    
    public boolean isEmpty() {
        return topo < 0;
    }
    
    public int size() {
      return topo + 1;  
    }
    
    public Object top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.elementos[topo];
    }
    
    public Object pop() {
        if(this.isEmpty()) {
            return null;
        } else {
            return this.elementos[this.topo--];
        }
    }
    
    public void pop2() {
        this.topo--;
    }
    
}
