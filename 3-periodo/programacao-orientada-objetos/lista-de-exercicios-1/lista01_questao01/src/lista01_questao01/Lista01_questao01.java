package lista01_questao01;

import java.util.Scanner;

public class Lista01_questao01 {  
    
    public static void main(String[] args) {
        String nome;
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        Produto produto1 = new Produto();
        
        System.out.println("SISPET - Seja bem vindo.");
        
        while (opcao != 5) {
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|                                                        |");
            System.out.println("|                   SISPET - SISTEMA PET                 |");
            System.out.println("|                                                        |");
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|1 - Cadastrar produto                                   |");
            System.out.println("|2 – Marcar tarefa como concluída                        |");
            System.out.println("|3 – Excluir tarefa                                      |");
            System.out.println("|4 – Listar tarefas                                      |");
            System.out.println("|5 – Sair                                                |");
            System.out.println("+--------------------------------------------------------+");
        
            System.out.print("Digite uma opção:");
            opcao = input.nextInt();
        
            if(opcao == 1){
                System.out.print("Digite o nome do produto: ");
                nome = input.next();
                produto1.setNome(nome);
                produto1.getNome();
            }
            
        }

    }
    
}
