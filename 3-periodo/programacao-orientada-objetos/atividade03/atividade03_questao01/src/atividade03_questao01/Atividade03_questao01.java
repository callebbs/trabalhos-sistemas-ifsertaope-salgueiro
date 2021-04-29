package atividade03_questao01;

import java.util.Scanner;

public class Atividade03_questao01 {
    public static void main(String[] args) {
        System.out.println("- Programa de Cálculo de Aumento Salarial -");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o seu salário: ");
        double salario = teclado.nextDouble();
        
        if (salario < 1000) {
        double aumento = salario * 0.15;
        double novo_salario = salario + aumento;
            System.out.println("Seu novo salário é: " + "R$" + novo_salario);
        } else {
            System.out.println("Não houve ajuste no seu salário.");
        } 
    }
    
}
