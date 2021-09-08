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
        String modelo;
        int velocidade;
        int numMarchas;
        boolean bagageiro;
        String sair;
        int qtdPortas;
        double potenciaDoMotor;
        boolean partidaEletrica;
        
        // Obtendo dados da Bicicleta
        
        System.out.println("Infomações da Bicileta: ");
        System.out.print("Digite a Marca: ");
        marca = input.next();
        bike1.setMarca(marca);
        
        System.out.print("Quantidade de Rodas: ");
        qtdRodas = input.nextInt();
        bike1.setQtdRodas(qtdRodas);
        
        System.out.print("Modelo da Bicicleta: ");
        modelo = input.next();
        bike1.setModelo(modelo);
        
        System.out.print("Quantidade de Marchas: ");
        numMarchas = input.nextInt();
        bike1.setNumMarchas(numMarchas);
        
        System.out.print("A bicicleta tem bagageiro (Digite True ou False)? ");
        bagageiro = input.nextBoolean();
        bike1.setBagageiro(bagageiro);
        
        System.out.print("Começar a andar com a bicileta (Digite Sim ou Não)? ");
        sair = input.next();
        if ("Sim".equals(sair)) {
            System.out.print("Digite a velocidade da Bicicleta: ");
            velocidade = input.nextInt();
            bike1.setVelocidade(velocidade);
        } else {
            velocidade = 0;
        }
        
        // Obtendo dados do Carro
        
        System.out.println("Informações do Carro: ");
        System.out.print("Digite a Marca: ");
        marca = input.next();
        carro1.setMarca(marca);
        
        System.out.print("Digite a quantidade de Rodas: ");
        qtdRodas = input.nextInt();
        carro1.setQtdRodas(qtdRodas);
        
        System.out.print("Digite a quantidade de portas: ");
        qtdPortas = input.nextInt();
        carro1.setQtdPortas(qtdPortas);
        
        System.out.print("Digite o modelo do carro: ");
        modelo = input.next();
        carro1.setModelo(modelo);
        
        System.out.print("Digite a potência do motor: ");
        potenciaDoMotor = input.nextDouble();
        carro1.setPotenciaDoMotor(potenciaDoMotor);
        
        System.out.print("Começar a andar com o carro (Digite Sim ou Não)? ");
        sair = input.next();
        if ("Sim".equals(sair)) {
            System.out.print("Digite a velocidade do carro: ");
            velocidade = input.nextInt();
            carro1.setVelocidade(velocidade);
        } else {
            velocidade = 0;
        }
        
        // Obtendo dados da Moto
        
        System.out.println("Informações da Moto: ");
        System.out.print("Digite a marca: ");
        marca = input.next();
        moto1.setMarca(marca);
        
        System.out.print("Digite a quantidade de rodas: ");
        qtdRodas = input.nextInt();
        moto1.setQtdRodas(qtdRodas);
        
        System.out.print("Digite o modelo da moto: ");
        modelo = input.next();
        moto1.setModelo(modelo);
        
        System.out.print("Digite a potência do motor: ");
        potenciaDoMotor = input.nextDouble();
        moto1.setPotenciaDoMotor(potenciaDoMotor);
        
        System.out.print("A moto tem partida elétrica (Digite True ou False)? ");
        partidaEletrica = input.nextBoolean();
        moto1.setPartidaEletrica(partidaEletrica);
        
        System.out.print("Começar a andar com a moto (Digite Sim ou Não)? ");
        sair = input.next();
        if ("Sim".equals(sair)) {
            System.out.print("Digite a velocidade do carro: ");
            velocidade = input.nextInt();
            moto1.setVelocidade(velocidade);
        } else {
            velocidade = 0;
        }
        
        bike1.imprimirInformacoes();
        moto1.imprimirInformacoes();
        carro1.imprimirInformacoes();
        
    }
    
}
