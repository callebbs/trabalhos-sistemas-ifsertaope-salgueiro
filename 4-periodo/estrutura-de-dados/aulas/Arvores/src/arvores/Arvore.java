package arvores;

public class Arvore {
    public No raiz;
    
    public Arvore() {
        this.raiz = null;
    }
    
    public boolean isEmpty() {
        return this.raiz == null;
    }
    
    public void inserir(int elemento) {
        if(isEmpty()) {
            this.raiz = new No(elemento);
        } else {
            No atual = this.raiz;
            
            while(atual != null) {
                if(elemento < atual.getValor()) {
                    if(atual.getEsq() == null) {
                        No novo = new No(elemento);
                        atual.setEsq(novo);
                        novo.setPai(atual);
                        return;
                    }
                    
                    atual = atual.getEsq();
                    
                } else {
                    if (atual.getDir() == null) {
                        No novo = new No(elemento);
                        atual.setDir(novo);
                        novo.setPai(atual);
                        return;
                    }
                    
                    atual = atual.getDir();
                }
            }
        }
    }
    
    public No busca(int elemento) {
        
        No atual = this.raiz;
        
        while(atual != null) {
            if(atual.getValor() == elemento) return atual;
            if(elemento < atual.getValor()) atual = atual.getEsq();
            if(elemento >= atual.getValor()) atual = atual.getDir();
        }
        
        return null;
         
        
    }
       
}
