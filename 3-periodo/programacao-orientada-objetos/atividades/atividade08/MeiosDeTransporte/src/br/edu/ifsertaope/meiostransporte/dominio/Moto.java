package br.edu.ifsertaope.meiostransporte.dominio;

public class Moto extends Automovel {
    private boolean partidaEletrica;
    
    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }
    
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Informações da Moto");
        System.out.println("-------------------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Quantidade de Rodas: " + getQtdRodas());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Partida elétrica: " + getPartidaEletrica());
        System.out.println("-------------------------------------");
        
    }
    
}
