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

    // Mostrando elementos pelo índice especificado
    public String busca(int posicao) {
        if (!((posicao >= 0) && (posicao < this.tamanho))) {
            throw new IllegalAccessError("Posição Inválida");
        } 
        return this.elementos[posicao];
        }

    // // Busca sequencial antigo
    // public boolean verifica(String elemento) {
    //     for (int i = 0; i < this.tamanho; i++) {
    //         if (this.elementos[i].equalsIgnoreCase(elemento)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // Busca sequencial    
    public int verifica(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
