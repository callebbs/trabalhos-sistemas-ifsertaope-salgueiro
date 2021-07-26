
package mainsispet.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cadastro {
    
    public static void Cadastrar(){
    Scanner input = new Scanner(System.in);
    Produto produto;
    List<Produto> listaProdutos = new ArrayList();
    
    produto = new Produto();

    System.out.print("Digite o nome do produto: ");
    produto.setNome(input.nextLine());

    System.out.print("Digite a descrição do produto: ");
    produto.setDescricao(input.nextLine());

    System.out.print("Digite o valor: ");
    produto.setValor(Double.parseDouble(input.nextLine()));

    System.out.print("Digite a quantidade: ");
    produto.setQuantidade(Integer.parseInt(input.nextLine()));
    }
    
}
