package br.edu.ifsertaope.meiostransporte.dominio;

public class MeiosDeTransporte {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta();
        Moto moto1 = new Moto();
        Carro carro1 = new Carro();
    
        bike1.imprimirInformacoes();
        
        moto1.imprimirInformacoes();
        
        carro1.setQtdPortas(4);
        
        carro1.imprimirInformacoes();
        
        carro1.acelerar(20);
        
        carro1.imprimirInformacoes();
    }
    
}
