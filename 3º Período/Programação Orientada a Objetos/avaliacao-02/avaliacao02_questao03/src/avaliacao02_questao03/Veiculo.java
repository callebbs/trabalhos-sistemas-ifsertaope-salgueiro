package avaliacao02_questao03;

public class Veiculo {
    
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade = 0;

    // Métodos get e set
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void imprimirInformacoes() {
        System.out.println("-------------------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Quantidade de Rodas: " + getQtdRodas());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("-------------------------------------");
    }
    
    public void acelerar(int valor) {
        velocidade = velocidade + valor;
    }
    
    public void frear(int valor) {
        velocidade = velocidade - valor;
    }
    
}
