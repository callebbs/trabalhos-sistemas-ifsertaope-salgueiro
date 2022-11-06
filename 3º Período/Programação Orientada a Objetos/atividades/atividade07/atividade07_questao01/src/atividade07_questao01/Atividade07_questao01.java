package atividade07_questao01;

import java.util.Scanner;

public class Atividade07_questao01 {

    public static void main(String[] args) {
        String nome;
        String endereco;
        String telefone;
        
        Pessoa cliente1 = new Pessoa();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome do cliente: ");
        nome = input.nextLine();
        cliente1.setNome(nome);
        System.out.print("Digite o endereço do cliente: ");
        endereco = input.nextLine();
        cliente1.setEndereco(endereco);
        System.out.print("Digite o telefone do cliente: ");
        telefone = input.nextLine();
        cliente1.setTelefone(telefone);
        
        cliente1.imprimir();
        
    }
    
}
