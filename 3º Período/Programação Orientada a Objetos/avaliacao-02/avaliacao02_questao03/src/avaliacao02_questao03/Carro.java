package avaliacao02_questao03;

public class Carro extends Automovel {
    private int qtdPortas;

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Informações do Carro");
        System.out.println("-------------------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Quantidade de Rodas: " + getQtdRodas());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de Portas: " + getQtdPortas());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("-------------------------------------");
    }
}
