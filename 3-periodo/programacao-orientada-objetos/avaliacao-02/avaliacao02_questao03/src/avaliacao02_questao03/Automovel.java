package avaliacao02_questao03;

public class Automovel extends Veiculo {
    
    private double potenciaDoMotor;

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Informações do Automóvel");
        System.out.println("-------------------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Quantidade de Rodas: " + getQtdRodas());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Potência do Motor: " + getPotenciaDoMotor());
        System.out.println("-------------------------------------");
    }
    
}