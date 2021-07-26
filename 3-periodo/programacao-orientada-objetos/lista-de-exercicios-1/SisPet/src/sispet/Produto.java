
package sispet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    
    private String nome;
    private String categoria;
    private double valor;
    private int quantidade;
    private List<Produto> listaProdutos = new ArrayList();
    private List<Produto> produto = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    public Produto() {
        
    }
    
    public Produto(String nome, String categoria, double valor, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        return "Nome: " + this.nome + "\n" +
                "Categoria: " + this.categoria + "\n" +
                "Valor: " + this.valor + "\n" +
                "Quantidade: " + this.quantidade;
    }
    
    public void cadastrarProduto() {
        
        System.out.println("Cadastro de produto: ");
        System.out.print("Digite o nome: ");
        this.nome = input.nextLine();
        
        System.out.print("Digite a categoria: ");
        this.categoria = input.nextLine();
        
        System.out.print("Digite o valor: ");
        this.valor = input.nextDouble();
        
        System.out.print("Digite a quantidade: ");
        this.quantidade = input.nextInt();
        
    }
    
    public void editarProduto() {
        
    }
}
