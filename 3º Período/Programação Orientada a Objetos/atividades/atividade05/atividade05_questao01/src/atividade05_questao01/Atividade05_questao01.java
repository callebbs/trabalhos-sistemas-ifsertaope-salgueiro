/*
Crie um novo projeto Java, em seguida crie uma classe Funcionario, 
essa classe deve possuir os seguintes atributos: 
int matricula, String nome, double salario. 
Ao final, instancie a classe Funcionario duas vezes no corpo do método main 
da classe principal, receba alguns dados do teclado para os atributos 
dos objetos e mostre os valores dos atributos na tela.
 */
package atividade05_questao01;

public class Atividade05_questao01 {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        
        funcionario1.cadastroFuncionario();
        funcionario2.cadastroFuncionario();
        
        funcionario1.dadosFuncionario();
        funcionario2.dadosFuncionario();
    }
    
}
