package aula12.ed;

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int totalDeElementos;
    
    
    public void adicionaNoInicio(Object elemento) {
        if(this.totalDeElementos == 0) {
            No novo = new No(elemento);
            this.inicio = novo;
            this.fim = novo;
        } else {
            No novo = new No(elemento, this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        }
        this.totalDeElementos++;
    }
    
    public void adicionaNoFinal(Object elemento) {
        if(this.totalDeElementos == 0) {
           this.adicionaNoInicio(elemento);
        } else {
            No novo = new No(elemento);
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
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

        for(int i = 0; i<this.totalDeElementos-1; i++) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getProximo();
        }

        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
    
}
