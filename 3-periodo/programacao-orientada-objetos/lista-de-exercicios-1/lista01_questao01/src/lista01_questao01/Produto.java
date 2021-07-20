package lista01_questao01;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private double valor;
    private int quantidade;
    
    Scanner input = new Scanner(System.in);
    
    public String CadastrarNome() {
        this.nome = input.nextLine();
        return this.nome;
        
    }
    
    public String CadastrarDescricao() {
        this.descricao = input.nextLine();
        return this.descricao;
    }
    
    public String CadastrarCategoria() {
        this.categoria = input.nextLine();
        return this.categoria;
    }
    
    
}
