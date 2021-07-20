package lista01_questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_questao01 {

    public static void main(String[] args) {
        int escolha;
        ArrayList<String> listaProdutos = new ArrayList();
        ArrayList<String> listaDescricoes = new ArrayList();
        ArrayList<String> listaCategorias = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("SISPET - Bem vindo(a)");
        System.out.println("Cadastro de produto: ");
        
        System.out.printf("Nome do produto: ");
        listaProdutos.add(produto.CadastrarNome());
        
        
        System.out.print("Descrição: ");
        listaDescricoes.add(produto.CadastrarDescricao());
        
        System.out.print("Categoria: ");
        listaCategorias.add(produto.CadastrarCategoria());
        
        
        System.out.println("Produtos: " + listaProdutos);
        System.out.println("Descrição: " + listaDescricoes);
        System.out.println("Categorias: " + listaCategorias);
        
        /*
        while (escolha != 5) {
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|                                                        |");
            System.out.println("|                   SISPET                               |");
            System.out.println("|                                                        |");
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|1 - Adicionar novo produto                              |");
            System.out.println("|2 – Marcar tarefa como concluída                        |");
            System.out.println("|3 – Excluir tarefa                                      |");
            System.out.println("|4 – Listar tarefas                                      |");
            System.out.println("|5 – Sair                                                |");
            System.out.println("+--------------------------------------------------------+");

            System.out.println("Digite uma opção: ");
            escolha = input.nextInt();
            
                if (escolha == 1) {
                    produto.setNome(nome);
                }
        }*/
        
        
        
    }
    
}
