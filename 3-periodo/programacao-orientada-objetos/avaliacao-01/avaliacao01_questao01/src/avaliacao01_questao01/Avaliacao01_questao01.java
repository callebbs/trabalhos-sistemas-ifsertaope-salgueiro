
package avaliacao01_questao01;

import java.util.Scanner;

public class Avaliacao01_questao01 {

    public static void main(String[] args) {
        Radio radio1 = new Radio();
        Scanner input = new Scanner(System.in);
        double frequencia;
        boolean frequenciaCorreta = false;
        
        System.out.println("Ligando o Rádio.");
        radio1.ligado = true;
        System.out.println("Digite uma frequência para sintonizar o rádio.");
        System.out.print("Frequências aceitas: 87.7 a 108.8: ");
        frequencia = input.nextDouble();
        
        
      
        System.out.println("Estado atual do rádio: ");
        if (radio1.ligado == true) {
            System.out.println("Rádio ligado: Sim.");
        } else {
            System.out.println("Rádio ligado: Não.");
        }
        
        System.out.println("Frequência atual: " + frequencia);
        System.out.print("-----------------------------------\n");
        
        
        System.out.println("Desligando o rádio.");
        radio1.ligado = false;
        System.out.print("-----------------------------------\n");
        
        System.out.println("Estado atual do rádio: ");
        if (radio1.ligado == true) {
            System.out.println("Rádio ligado: Sim.");
        } else {
            System.out.println("Rádio ligado: Não.");
        }
        System.out.println("Frequência atual: Nenhuma.");
    }
    
}
