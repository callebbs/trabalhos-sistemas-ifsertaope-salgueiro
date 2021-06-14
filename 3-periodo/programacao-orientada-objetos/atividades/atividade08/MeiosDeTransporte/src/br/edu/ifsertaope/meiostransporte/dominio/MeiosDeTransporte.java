package br.edu.ifsertaope.meiostransporte.dominio;

import java.util.Scanner;

public class MeiosDeTransporte {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta();
        Moto moto1 = new Moto();
        Carro carro1 = new Carro();
        Scanner input = new Scanner(System.in);
        
        String marca;
        int qtdRodas;
        
        System.out.println("Insira as informações a seguir: ");
        System.out.println("Bicileta");
        System.out.print("Digite a Marca: ");
        marca = input.nextLine();
        bike1.setMarca(marca);
        System.out.print("Digite a quantidade de rodas: ");
        qtdRodas = input.nextInt();
        bike1.setQtdRodas(qtdRodas);
        
    }
    
}
