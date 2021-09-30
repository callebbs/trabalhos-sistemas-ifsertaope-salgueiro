package aula002.ed;

public class Vetor {
    
    private String[] elementos;
    private int tamanho;
    
    // Criando uma lista vazia
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    /*
    // Insere elementos
    public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    */
    
    // Insere elementos - OTIZIMADO
    public boolean adiciona(String elemento) {
        
        if(tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
        
        
        
    }
}
