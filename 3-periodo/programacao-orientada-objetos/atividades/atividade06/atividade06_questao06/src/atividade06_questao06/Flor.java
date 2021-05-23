package atividade06_questao06;

import java.util.Scanner;

public class Flor {
    String nome;
    int petalas;
    double preco;
    
    Scanner input = new Scanner(System.in);
    
    Flor() {
        nome = "Rosa";
        petalas = 5;
        preco = 9.99;
    }
    
    void infos() {
        System.out.println("Nome da flor: " + nome);
        System.out.println("Quantidade de pétalas: " + petalas);
        System.out.println("Preço da flor: " + preco);
    }
    
    void alterarInformacoes() {
        System.out.print("Digite o nome da flor: ");
        nome = input.nextLine();
        System.out.print("Digite a quantidade de pétalas: ");
        petalas = input.nextInt();
        System.out.print("Digite o preço da flor: ");
        preco = input.nextDouble();
        System.out.println("Modificações realizadas com sucesso.");
        
        }
    
    void recuperarInformacoes() {
        System.out.println("Recuperando dados originais...");
        nome = "Rosa";
        petalas = 5;
        preco = 9.99;
        System.out.println("Concluído.");
    }
}
