package aula12.ed;

public class ListaEncadeada {
    private No inicio;
    private No fim;
    private int totalDeElementos;
    
    public void adicionaNoInicio(Object elemento) {
        No novo = new No(elemento, this.inicio);
        this.inicio = novo;
        
        if(this.totalDeElementos == 0) {
            this.fim = novo;
        }
        this.totalDeElementos++;
    }
    
    public void adicionaNoFinal(Object elemento) {
        if(this.totalDeElementos == 0) {
            this.adicionaNoInicio(elemento);
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
    //Verifica se a posição é válida
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    
    //Retorna a posição atual
    private No pegaNo(int posicao) {
        if(!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        No atual = this.inicio;
        for(int i = 0; i < posicao - 1; i++) {
            atual = atual.getProximo();
        }
        return atual;    
    }
    
    public void adiciona(int posicao, Object elemento) {
        if(posicao == 0) {
            this.adicionaNoInicio(elemento);
        } else if(posicao == this.totalDeElementos) {
            this.adicionaNoFinal(elemento);
        } else {
            No anterior = this.pegaNo(posicao);
            No novo = new No(elemento, anterior.getProximo());
            anterior.setProximo(novo);
            this.totalDeElementos++;
        } 
    }
    
}
