package lista01_questao01;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
    // Declaração de variáveis
    private String nome;
    private String descricao;
    private String categoria;
    private double valor;
    private int quantidade;
    private int codigo;
    
    // Instanciamento de objetos
    Scanner input = new Scanner(System.in);
    ArrayList<String> listaNomes = new ArrayList();
    ArrayList<String> listaDescricoes = new ArrayList();
    ArrayList<String> listaCategorias = new ArrayList();
    ArrayList<Double> listaValores = new ArrayList();
    ArrayList<Integer> listaQuantidades = new ArrayList();
    
    // Sets
    public void CadastrarNome() {
        this.nome = input.nextLine();
        listaNomes.add(this.nome);
    }
    
    public void CadastrarDescricao() {
        this.descricao = input.nextLine();
        listaDescricoes.add(this.descricao);
        
    }
    
    public void CadastrarCategoria() {
        this.categoria = input.next();
        listaCategorias.add(this.categoria);
        
    }

    public void CadastrarValor() {
        this.valor = input.nextDouble();
        listaValores.add(this.valor);
        
    }
    
    public void CadastrarQuantidades() {
        this.quantidade = input.nextInt();
        listaQuantidades.add(this.quantidade);
        
    }
    
    // Gets
    
    public void getEstoque() {
        System.out.println("Lista de produtos cadastrados: ");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Código: " + i + 
                    " | Produto: " + listaNomes.get(i) +
                    " | Quantidade: " + listaQuantidades.get(i));
        }
        
    }
   
    
    
}
