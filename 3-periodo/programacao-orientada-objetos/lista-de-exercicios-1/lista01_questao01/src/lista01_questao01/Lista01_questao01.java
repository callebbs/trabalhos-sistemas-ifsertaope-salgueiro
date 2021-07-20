package lista01_questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista01_questao01 {

    public static void main(String[] args) {
        Menu();
    
}
    
public static void Menu() {
    Scanner input = new Scanner(System.in);
    Produto produto;
    List<Produto> listaProdutos = new ArrayList();
    
    int opcao = 0;
    int altProduto;
    
    do {
        System.out.println("## SISPET ##");
        System.out.println("1 - Cadastrar produtos");
        System.out.println("2 - Editar produtos");
        System.out.println("3 - Excluir produtos");
        System.out.println("4 - Realizar venda");
        System.out.println("5 - Pesquisar produto por descrição");
        System.out.println("6 - Pesquisar produto por código");
        System.out.println("7 - Relatório de estoque");
        System.out.println("8 - Sair");
        
        System.out.print("Digite a opção desejada: ");
        opcao = Integer.parseInt(input.nextLine());
        
        if (opcao == 1) {
            produto = new Produto();
            
            System.out.print("Digite o nome do produto: ");
            produto.setNome(input.nextLine());
            
            System.out.print("Digite a descrição do produto: ");
            produto.setDescricao(input.nextLine());
            
            System.out.print("Digite o valor: ");
            produto.setValor(Double.parseDouble(input.nextLine()));
            
            System.out.print("Digite a quantidade: ");
            produto.setQuantidade(Integer.parseInt(input.nextLine()));
            
            System.out.print("Digite o código do produto: ");
            produto.setCodigo(Integer.parseInt(input.nextLine()));
            
            listaProdutos.add(produto);
        } else if (opcao == 3) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.println(listaProdutos.get(i));
            }
            System.out.println("Digite o código do item que deseja editar: ");
            altProduto = input.nextInt();
            
            for (int i = 0; i < listaProdutos.size(); i++) {
                
                    
                }
            }
            
            
            
        
        } else if (opcao == 7) {
            if (listaProdutos.isEmpty()) {
                System.out.print("Não existem produtos cadastrados.\nAperte enter para continuar.");
                input.nextLine();
            } else {
            System.out.println("Produtos em estoque: ");
            for (int i = 0; i < listaProdutos.size(); i++ ) {
                System.out.println(listaProdutos.get(i));
            }
            }
        }
    
    } while (opcao != 8);
    }
}
