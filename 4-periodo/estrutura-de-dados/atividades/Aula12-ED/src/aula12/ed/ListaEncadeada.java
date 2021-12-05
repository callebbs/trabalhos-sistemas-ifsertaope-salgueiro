package aula12.ed;

public class ListaEncadeada {
    private No inicio;
    private No fim;
    private int totalDeElementos;
    
    public void adicionaInicio(Object elemento) {
        No novo = new No(elemento, this.inicio);
        this.inicio = novo;
        
        if(this.totalDeElementos == 0) {
            this.fim = novo;
        }
        this.totalDeElementos++;
    }
    
    public void adicionaNoFinal(Object elemento) {
        if(this.totalDeElementos == 0) {
            this.adicionaInicio(elemento);
        } else {
            No novo = new No(elemento);
            this.fim.setProximo(novo);
            this.fim = novo;
            this.totalDeElementos++;
        }
    }

    public String toString() {
        if(this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        No atual = this.inicio;
        for(int i = 0; i < this.totalDeElementos-1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
    
    
}
