package atividade03.ed;

public class ListaEncadeada {
    private No inicio;
    private No fim;
    private int totalDeElementos;
	
    public void adicionaNoFinal(Object elemento) {
        //Instanciando o objeto Nó, recebemos o elemento e o nó do final da lista encadeada.
        No novo = new No(elemento, this.fim);
        //O objeto instanciado entra sendo o elemento final da lista.
        this.fim = novo;

        //Aqui verifica-se se a lista encadeada está vazia, caso esteja, o elemento também é adicionado ao início da lista encadeada.
        if(this.totalDeElementos == 0) {
                this.inicio = novo;
        }
        //Incrementação para nova adição de elementos.
        this.totalDeElementos++;
        }
    
    @Override
    public String toString() {
            return "Lista [inicio=" + inicio.getElemento() + ", fim=" + fim.getElemento() + ", totalDeElementos=" + totalDeElementos + "]";
    }
	
}