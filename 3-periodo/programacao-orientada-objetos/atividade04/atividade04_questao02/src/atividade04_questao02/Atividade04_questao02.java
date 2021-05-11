/*
Uma escola deseja saber se existem alunos cursando, simultaneamente, as disciplinas 
Banco de Dados I e Linguagem de Programação. Crie um programa que armazene as 10 matrículas 
dos alunos que cursam Banco de Dados I em um vetor. Em outro vetor devem ser armazenadas 
as matrículas dos alunos que cursam Linguagem de Programação. Mostre os números das matrículas 
que são comuns aos dois vetores.

 */
package atividade04_questao02;

import java.util.Scanner;

public class Atividade04_questao02 {

    public static void main(String[] args) {
        
        int[] mat_bd1 = new int[10];
        int[] mat_lp = new int[10];
        Scanner input = new Scanner(System.in);
    
        // Recebendo as matrículas
        System.out.println("-- Cadastro de Matrículas --");
        System.out.println("Disciplina: Banco de Dados I");
        for (int i = 0; i < mat_bd1.length; i++) {
            System.out.print("Digite a matrícula do aluno: ");
            mat_bd1[i] = input.nextInt();
        }
        System.out.println("Disciplina: Linguagem de Programação");
        for (int i = 0; i < mat_lp.length; i++) {
            System.out.print("Digite a matrícula do aluno: ");
            mat_lp[i] = input.nextInt();
        }
        System.out.println("Matrículas cadastradas com sucesso.");
        
        // Comparando matrículas
        System.out.println("Aluno(s) que está(ão) matrículado(s) nas duas cadeiras: ");
        for (int i = 0; i < 10; i++) {
            if (mat_bd1[i] == mat_lp[i]) {
                System.out.println(mat_bd1[i]);
            }
        }
    }
    
}