package br.edu.ifsertaope.meiostransporte.dominio;


public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }
    
    public boolean getBagageiro() {
        return bagageiro;
    }
    
    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Informações da Bicicleta");
        System.out.println("-------------------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Quantidade de Rodas: " + getQtdRodas());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Número de marchas: " + getNumMarchas());
        System.out.println("Bagageiro: " + getBagageiro());
        System.out.println("-------------------------------------");
    }
}
