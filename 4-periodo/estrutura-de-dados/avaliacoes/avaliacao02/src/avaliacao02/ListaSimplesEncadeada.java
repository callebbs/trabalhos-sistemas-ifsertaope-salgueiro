package avaliacao02;

public class ListaSimplesEncadeada {
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
            No novo = new No(elemento, this.fim);
            this.fim.setProximo(novo);
            this.fim = novo;
            if(this.totalDeElementos == 0) {
                    this.adicionaNoInicio(elemento);
            }
            this.totalDeElementos++;
    }

    public void adicionaNoFinalNew(Object elemento) {
            if(this.totalDeElementos == 0) {
                    this.adicionaNoInicio(elemento);
            }else {
                    No novo = new No(elemento);
                    this.fim.setProximo(novo);
                    this.fim = novo;
                    this.totalDeElementos++;
            }
    }

    private boolean posicaoValida(int posicao) {
            return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private No pegaNo(int posicao) {
            if(this.posicaoValida(posicao) != true) {
                    throw new IllegalArgumentException("Posição inválida!");
            }
            No atual = this.inicio;
            for(int i = 0; i<posicao; i++) {
                    atual = atual.getProximo();
            }
            return atual;
    }

    public Object pega(int posicao) {
            return this.pegaNo(posicao).getElemento();
    }

    public void adiciona(int posicao, Object elemento) {
            if(posicao == 0) {
                    this.adicionaNoInicio(elemento);
            }else if(posicao == this.totalDeElementos){
                    this.adicionaNoFinalNew(elemento);
            }else {
                    No anterior = this.pegaNo(posicao-1);
                    No novo = new No(elemento, anterior.getProximo());
                    anterior.setProximo(novo);
                    this.totalDeElementos++;
            }
    }

    public void removeDoComeco() {
            if(!this.posicaoValida(0)) {
                    throw new IllegalArgumentException("Posição inválida!");
            }
            this.inicio = this.inicio.getProximo();
            this.totalDeElementos--;

            if(this.totalDeElementos == 0) {
                    this.fim = null;
            }
    }

    public void removeDoFinal() {
            if(!this.posicaoValida(this.totalDeElementos-1)) {
                    throw new IllegalArgumentException("Posição inválida!");
            }
            if(this.totalDeElementos == 0) {
                    System.out.println("Lista vazia!");
            }else {
                    No penultimo = this.pegaNo(this.totalDeElementos-2);
                    penultimo.setProximo(null);
                    this.fim = penultimo;
                    this.totalDeElementos--;
            }
    }

    public void removeDoFinalMelhorado() {
            if(!this.posicaoValida(this.totalDeElementos-1)) {
                    throw new IllegalArgumentException("Posição inválida!");
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

    public void remove(int posicao) {
            if(!this.posicaoValida(posicao)) {
                    throw new IllegalArgumentException("Posição inválida!");
            }
            if(posicao == 0) {
                    this.removeDoComeco();
            }else if(posicao == this.totalDeElementos - 1){
                    this.removeDoFinal();
            }else {
                    No anterior = this.pegaNo(posicao-1);
                    No atual = anterior.getProximo();
                    No proximo = atual.getProximo();
                    anterior.setProximo(proximo);
                    proximo.setAnterior(anterior);
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

            for(int i = 0; i < this.totalDeElementos-1; i++) {
                    builder.append(atual.getElemento());
                    builder.append(", ");
                    atual = atual.getProximo();
            }

            builder.append(atual.getElemento());
            builder.append("]");
            return builder.toString();
    }
    
    //AVALIAÇÃO 02 - ESTRUTURA DE DADOS
    
    //QUESTÃO 01
    
    public void removeListaOrdena() {
        No atual = this.inicio;
        int menor = 0;
        int maior;
        for (int i = 0; i < this.totalDeElementos; i++) {
            
        }
    }
        
}
