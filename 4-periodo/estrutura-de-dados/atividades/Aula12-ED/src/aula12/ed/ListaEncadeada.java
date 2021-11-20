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
    
}
