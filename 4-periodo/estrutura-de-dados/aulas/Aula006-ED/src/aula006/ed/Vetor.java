package aula006.ed;

import java.util.Arrays;

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
    public boolean adicionaUltimaPosicao(String elemento) {
        
        if(tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
    
    
    //Imprimindo valores com Null
    
    public String toStringTudo() {
        return Arrays.toString(elementos);
    }

    // Mostrando elementos pelo índice especificado
    public String busca(int posicao) {
        if (!((posicao >= 0) && (posicao < this.tamanho))) {
            throw new IllegalAccessError("Posição Inválida");
        } 
        return this.elementos[posicao];
        }

    // Busca sequencial antigo
    
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
    
    //Adiciona qualquer elemento no índice que o usuário quiser
    
    public boolean adiciona(int posicao, String elemento) {
        aumentaCapacidade();
        
        if (!((posicao >= 0) && (posicao <= this.tamanho))) {
            throw new IllegalAccessError("Posição Inválida");
        }
        // Move os elementos já existentes para o próximo índice
        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i]; 
       }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }
    
    public void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
}
