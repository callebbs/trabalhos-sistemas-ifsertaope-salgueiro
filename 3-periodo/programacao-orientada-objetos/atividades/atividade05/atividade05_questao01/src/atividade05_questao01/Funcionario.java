
package atividade05_questao01;

import java.util.Scanner;

public class Funcionario {
    Scanner input = new Scanner(System.in);
    int matricula;
    String nome;
    double salario;
    
    void cadastroFuncionario() {
        System.out.println("== Cadastro de Funcionários ==");
        System.out.print("Digite a matrícula do funcionário: ");
        matricula = input.nextInt();
        System.out.print("Digite o nome do funcionário: ");
        nome = input.next();
        System.out.print("Digite o salário do funcionário: ");
        salario = input.nextDouble();
        System.out.println("== Cadastro finalizado com sucesso ==");
    }
    
    void dadosFuncionario() {
        System.out.println("== Dados do Funcionário ==");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario );
        System.out.println("==========================");
    }
}
