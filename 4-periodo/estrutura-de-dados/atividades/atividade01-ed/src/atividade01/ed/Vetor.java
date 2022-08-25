package atividade01.ed;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    public boolean adiciona(String elemento) {
        
        if(tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
    
    public int tamanhoVetor() {
        return this.tamanho;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho -1; i++) {
            s.append(this.elementos[i] + ", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho -1]);
        }
        s.append("]");
        return s.toString();
    }
}
