package sispet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SisPet {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList();
        int codProduto;
        
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println(" ----   SIS PET  ----");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Editar produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Pesquisar produto (por categoria)");
            System.out.println("5 - Pesquisar produto (por código)");
            System.out.println("6 - Realizar venda");
            System.out.println("7 - Visualizar relatório de estoque");
            System.out.println("8 - Sair");
            System.out.println("---------------------");
            
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            
            // Cadastro de produtos
            if (opcao == 1) {
            Produto produto = new Produto();
            produto.cadastrarProduto();
            listaProdutos.add(produto);
            
            // Editar produtos
        } else if (opcao == 2) {
            
            if (listaProdutos.isEmpty() == true) {
                System.out.println("Não existe nenhum produto cadastrado.");
            } else {
            
                System.out.println("Produtos cadastrados: ");
            
                for (int i = 0; i < listaProdutos.size(); i++) {
                    System.out.println("Código: " + i + " | " + 
                            "Produto: " + listaProdutos.get(i).getNome());
                }
            
                    System.out.print("Digite o código do produto: ");
                    codProduto = input.nextInt();
                    
                    do {
                        System.out.println(" ----   EDITAR PRODUTO  ----");
                        System.out.println("1 - Editar nome");
                        System.out.println("2 - Editar categoria");
                        System.out.println("3 - Editar valor");
                        System.out.println("4 - Editar quantidade");
                        System.out.println("5 - Sair");
                        System.out.println("---------------------");
                        
                        System.out.print("Escolha uma opção: ");
                        opcao = input.nextInt();
                        
                        if (opcao == 1) {
                            System.out.println("Digite o novo nome: ");
                            String nome = input.next();
                            listaProdutos.get(codProduto).setNome(nome);
                            System.out.println("Nome alterado com sucesso.");
                        } else if (opcao == 2) {
                            System.out.println("Digite a nova categoria: ");
                            String categoria = input.nextLine();
                            listaProdutos.get(codProduto).setCategoria(categoria);
                            System.out.println("Categoria alterada com sucesso.");
                        } else if (opcao == 3) {
                            System.out.println("Digite o novo valor: ");
                            double valor = input.nextDouble();
                            listaProdutos.get(codProduto).setValor(valor);
                            System.out.println("Valor alterado com sucesso.");
                        } else if (opcao == 4) {
                            System.out.println("Digite a nova quantidade: ");
                            int quantidade = input.nextInt();
                            listaProdutos.get(codProduto).setQuantidade(quantidade);
                            System.out.println("Quantidade alterada com sucesso.");
                        }
                    } while (opcao != 5);
                    
            }
            // Excluir produtos
        } else if (opcao == 3) {
                System.out.println("Produtos cadastrados: ");
            
                for (int i = 0; i < listaProdutos.size(); i++) {
                    System.out.println("Código: " + i + " | " + 
                            "Produto: " + listaProdutos.get(i).getNome());
                }
            
                    System.out.print("Digite o código do produto: ");
                    codProduto = input.nextInt();
                    
                    listaProdutos.remove(codProduto);
                    System.out.println("Produto removido com sucesso.");
                    
            // Pesquisar por categoria
        } else if (opcao == 4) {
                System.out.println("Pesquisa por categoria:");
                System.out.print("Digite uma categoria de produto: ");
                String catProduto = input.next();
                
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (catProduto.equals(listaProdutos.get(i).getCategoria())) {
                        System.out.println("Produto encotrado:");
                        System.out.println(listaProdutos.get(i));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    
                }
            // Pesquisar por código
        } else if (opcao == 5) {
                System.out.println("Pesquisa por código:");
                System.out.print("Digite um código de produto: ");
                codProduto = input.nextInt();
                
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (codProduto == i) {
                        System.out.println("Produto encotrado:");
                        System.out.println(listaProdutos.get(i));
                    } else {
                        System.out.println("Código não encontrado.");
                    }
                    
                }
            // Realizar venda
        } else if (opcao == 6) {
                System.out.println(" --- VENDA ---");
                System.out.println("Digite o código do produto: ");
                codProduto = input.nextInt();
                System.out.println(listaProdutos.get(codProduto));
                
                System.out.print("Quantidade de produtos para adicionar ao carrinho: ");
            // Relatório do estoque
        } else if (opcao == 7) {
            
        }
        } while (opcao != 8);
  
    }
   
}
