package lista01_questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_questao01 {

    public static void main(String[] args) {
        
        int escolha = 0;
        
        Scanner input = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("SISPET - Bem vindo(a)");
        System.out.println("Cadastro de produto: ");
        
        while (escolha != 8) {
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|                                                        |");
            System.out.println("|                   SISPET                               |");
            System.out.println("|                                                        |");
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|1 - Adicionar novo produto                              |");
            System.out.println("|2 – Editar produto                                      |");
            System.out.println("|3 – Excluir produto                                     |");
            System.out.println("|4 – Pesquisar produto por descrição                     |");
            System.out.println("|5 – Pesquisar produto por código                        |");
            System.out.println("|6 – Realizar uma venda                                  |");
            System.out.println("|7 – Relatório de estoque                                |");
            System.out.println("|8 – Fechar o sistema                                    |");
            System.out.println("+--------------------------------------------------------+");

            System.out.print("Digite uma opção: ");
            escolha = input.nextInt();
            
            if (escolha == 1) {
                System.out.printf("Nome do produto: ");
                produto.CadastrarNome();
        
                System.out.print("Descrição: ");
                produto.CadastrarDescricao();
        
                System.out.print("Categoria: ");
                produto.CadastrarCategoria();

                System.out.print("Valor: ");
                produto.CadastrarValor();

                System.out.print("Quantidade: ");
                produto.CadastrarQuantidades();
            }
            
            if (escolha == 2) {
                System.out.println("Relatório de estoque: ");
                produto.getEstoque();
                
            }
        }
        
        
        
    }
    
}
