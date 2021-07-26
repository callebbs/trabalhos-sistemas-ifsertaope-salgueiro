package lista01_questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    
    // Declaração de variáveis
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + " | " + 
                "Valor: " + this.valor + " | " + 
                "Quantidade: " + this.quantidade;
    }
}

         
