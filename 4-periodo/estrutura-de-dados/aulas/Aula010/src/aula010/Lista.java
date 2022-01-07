package aula010;

public class Lista {
    private No inicio;
    private No fim;
    private int totalDeElementos;

    public void adicionaNoInico(Object elemento) {
            No novo = new No(elemento, this.inicio);
            this.inicio = novo;
            if(this.totalDeElementos == 0) {
                    this.fim = novo;
            }
            this.totalDeElementos++;
    }

    /*Adicionando nos no final da lista*/
    public void adicionaNoFinal(Object elemento) {/*O m�todo recebe o elemento que ir� ser adicionado no final da lista*/
            No novo = new No(elemento, this.fim);/*� declarado um novo objeto da classe n� que recebe o elemento e o atributo fim que indica a posi��o final da lista*/
            this.fim.setProximo(novo);
            this.fim = novo;/*a posi��o final recebe o objeto n�*/
            if(this.totalDeElementos == 0) {/*Fazendo essa verifica��o com o if, caso o total de elementos seja zero a posic��o inicial receber� o objeto n� para assim dar inicio a encadeamento*/
                    this.adicionaNoInico(elemento);
            }
            this.totalDeElementos++;/*Após o if o total de elementos recebe um incremento*/
    }

    public void adicionaNoFinalNew(Object elemento) {
            if(this.totalDeElementos == 0) {
                    this.adicionaNoInico(elemento);
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
                    this.adicionaNoInico(elemento);
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
            throw new IllegalArgumentException("Posição inválida");
        }
        this.inicio = this.inicio.getProximo();
        this.totalDeElementos--;
        
        if (this.totalDeElementos == 0) {
            this.fim = null;
        }
    }
    
    public void removeDoFinal() {
        if(!this.posicaoValida(this.totalDeElementos-1)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if(this.totalDeElementos == 0) {
            System.out.println("Lista Vazia!");
        } else {
            No anterior = this.pegaNo(totalDeElementos-2);
            anterior.setProximo(null);
            this.fim = anterior;
            this.totalDeElementos--;
        }
    }
    
    public void removeDoFinalMelhorado() {
        if(!this.posicaoValida(this.totalDeElementos-1)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            No penultimo = this.fim.getAnterior();
            penultimo.setProximo(null);
            this.fim = penultimo;
            this.totalDeElementos--;
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
