package aula12.ed;

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int totalDeElementos;
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
	
    private No pegaNo(int posicao) {
            if(this.posicaoValida(posicao) != true) {
                    throw new IllegalArgumentException("Posi��o inv�lida!");
            }
            No atual = this.inicio;
            for(int i = 0; i<posicao; i++) {
                    atual = atual.getProximo();
            }
            return atual;
    }
	
    public void adicionaNoInicio(Object elemento) {
            if(this.totalDeElementos == 0) {
                    No novo = new No(elemento);
                    this.inicio = novo;
                    this.fim = novo;
            }else {
                    No novo = new No(elemento);
                    this.inicio.setAnterior(novo);
                    this.inicio = novo;
            }
            this.totalDeElementos++;
    }
	
    public void adicionaNoFinal(Object elemento) {
            if(this.totalDeElementos == 0) {
                    this.adicionaNoInicio(elemento);
                    this.totalDeElementos++;
            }else {
                    No novo = new No(elemento);
                    this.fim.setProximo(novo);
                    novo.setAnterior(this.fim);
                    this.fim = novo;
                    this.totalDeElementos++;
            }
    }
	
    public void adiciona(int posicao, Object elemento) {
            if(!this.posicaoValida(posicao)) {
                    throw new IllegalArgumentException("Posi��o inv�lida!");
            }
            if(posicao == 0) {
                    this.adicionaNoInicio(elemento);
            }else if(posicao == this.totalDeElementos-1) {
                    this.adicionaNoFinal(elemento);
            }else {
                    No anterior = this.pegaNo(posicao-1);
                    No proximo = anterior.getProximo();
                    No novo = new No(elemento, proximo);
                    anterior.setProximo(novo);
                    proximo.setAnterior(novo);
                    this.totalDeElementos++;
            }
    }
	
    public void removeDoComeco() {
            if(!this.posicaoValida(0)) {
                    throw new IllegalArgumentException("Posi��o inv�lida!");
            }
            this.inicio = this.inicio.getProximo();
            this.totalDeElementos--;

            if(this.totalDeElementos == 0) {
                    this.fim = null;
            }
    }
	
    public void remove(int posicao) {
            if(!this.posicaoValida(posicao)) {
                    throw new IllegalArgumentException("Posi��o inv�lida!");
            }
            if(posicao == 0) {
                    this.removeDoComeco();
            }else if(posicao == this.totalDeElementos - 1){
                    this.removeDoFinalMelhorado();
            }else {
                    No anterior = this.pegaNo(posicao-1);
                    No atual = anterior.getProximo();
                    No proximo = atual.getProximo();
                    anterior.setProximo(proximo);
                    this.totalDeElementos--;
            }
    }
	
    public void removeDoFinalMelhorado() {
            if(!this.posicaoValida(this.totalDeElementos-1)) {
                    throw new IllegalArgumentException("Posi��o inv�lida!");
            }
            if(this.totalDeElementos == 1) {
                    this.removeDoComeco();
            }else {
                    No penultimo = this.fim.getAnterior();
                    penultimo.setProximo(null);
                    this.fim = penultimo;
                    this.totalDeElementos--;
            }
    }
	
    public boolean contem(Object elemento){
            No atual = this.inicio;

            while(atual != null) {
                    if(atual.getElemento().equals(elemento)) {
                            return true;
                    }
                    atual = atual.getProximo();
            }
            return false;
    }
	
    public int tamanho() {
            return this.totalDeElementos;
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
