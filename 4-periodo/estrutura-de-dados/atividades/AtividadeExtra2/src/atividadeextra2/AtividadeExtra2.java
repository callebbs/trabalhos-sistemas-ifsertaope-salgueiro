package atividadeextra2;

import java.util.LinkedList;
import java.util.Scanner;

public class AtividadeExtra2 {

    public static void main(String[] args) {
        LinkedList funcionarios = new LinkedList();

        // Questão 01
        System.out.println("Questão 01");
        System.out.println("Adicionando funcionários...");
        funcionarios.add("Alfredo");
        funcionarios.add("Jose");
        funcionarios.add("Zezinho");
        funcionarios.add("Eduardo");
        funcionarios.add("Rodrigo");
        System.out.println("Funcionários adicionados.");
        System.out.println(funcionarios);
        System.out.println("--------------------------------");
        
        // Questão 02
        System.out.println("Questão 02");
        System.out.println("Na lista Funcionários contém Eduardo?");
        
        if (funcionarios.contains("Eduardo") == true) {
            System.out.println("Eduardo está na lista.");
        } else {
            System.out.println("Eduardo não está na lista.");
        }
        System.out.println(funcionarios);
        System.out.println("--------------------------------");
        
        // Questão 03
        System.out.println("Questão 03");
        System.out.println("O funcionário no índice 1 da lista é: " + funcionarios.get(1));
        System.out.println(funcionarios);
        System.out.println("--------------------------------");
        
        // Questão 04
        System.out.println("Questão 04");
        System.out.println("Adicionando no início da lista...");
        funcionarios.addFirst("Calleb");
        System.out.println("Removendo no final da lista...");
        funcionarios.removeLast();
        System.out.println(funcionarios);
        System.out.println("--------------------------------");
        
        // Questão 05
        System.out.println("Questão 05");
        System.out.println("Primeiro e ùltimo da lista:");
        System.out.println(funcionarios.getFirst());
        System.out.println(funcionarios.getLast());
        System.out.println(funcionarios);
        System.out.println("--------------------------------");
        
        // Questão 06
         System.out.println("Questão 06");
         System.out.println("Removendo o índice 3 da lista:");
         funcionarios.remove(3);
         System.out.println(funcionarios);
    }
}
