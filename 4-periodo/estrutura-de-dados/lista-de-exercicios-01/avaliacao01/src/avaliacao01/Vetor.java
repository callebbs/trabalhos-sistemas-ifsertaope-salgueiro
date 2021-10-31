package avaliacao01;

import java.util.Arrays;

public class Vetor {
        private Object[] elementos;
    private int tamanho;
    
    // Criando uma lista vazia
    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    
    
    // Insere elementos - OTIZIMADO
    public boolean adicionaUltimaPosicao(Object elemento) {
        
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
    public Object busca(int posicao) {
        if (!((posicao >= 0) && (posicao < this.tamanho))) {
            throw new IllegalAccessError("Posição Inválida");
        } 
        return this.elementos[posicao];
        }

    // Busca sequencial    
    public int verifica(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    //Adiciona qualquer elemento no índice que o usuário quiser
    
    public boolean adiciona(int posicao, Object elemento) {
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public void remove(int posicao) {
       if (!((posicao >= 0) && (posicao < this.tamanho))) {
            throw new IllegalAccessError("Posição Inválida");
        }
       for (int i = posicao; i < tamanho-1; i++) {
           this.elementos[i] = this.elementos[i+1];
       }
       tamanho--;
    }

    
    // Lista de Exercícios 01
    // Acrescente uma operação na classe Vetor, implemente um novo método. 
    // A nova operação deve remover da Lista todas as ocorrências de um elemento que é passado com parâmetro. 
    // Não esqueça de rearranjar os elementos do vetor após a remoção.
    
    public void removeElementos(Object elemento) {
        for (int i = 0; i <  this.tamanho; i++) {
            if (elemento.equals(this.elementos[i])) {
                this.elementos[i] = this.elementos[i+1];
            }
        }
        tamanho--;
    }
    
    /*Acrescente uma operação na classe Vetor, implementando um novo método. 
    A nova operação deve procurar o índice da primeira ocorrência de um 
    elemento passado como parâmetro.*/
    
    public void buscaIndice(Object elemento) {
        boolean encontrado = false;
        int indice = 0;
        for (int i = 0; i <= this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                encontrado = true;
                indice = i;
                break;
            }
        }
        if (encontrado == true) {
            System.out.println("Elemento encontrado no índice " + indice + ".");
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
    
    //Avaliação 01
    
    // Questão 01
    // Crie uma operação na Lista, para isso, adicione um novo método. 
    // A nova operação deve limpar a lista, ou seja, remover todos os elementos.
    
    public void clear(){
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = null;
        }
        System.out.println("Vetor limpo.");
    }
    
    // Questão 02
    // Implemente mais uma operação na Lista, adicionando um novo método. 
    // A nova operação deve procurar o índice da última ocorrência de um elemento passado como parâmetro.
       
    public void lastIndexOf(Object objeto) {
        boolean encontrado = false;
        int indice = 0;
        for (int i = 0; i <= 3; i++) {
            if(this.elementos[i].equals(objeto)) {
                encontrado = true;
                indice = i;
            } 
        }
        if (encontrado == true) {
            System.out.println("Elemento encontrado no índice " + indice + ".");
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
    
}
