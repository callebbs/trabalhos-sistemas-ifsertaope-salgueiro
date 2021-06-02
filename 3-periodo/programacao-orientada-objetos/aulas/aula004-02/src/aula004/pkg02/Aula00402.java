package aula004.pkg02;

public class Aula00402 {

    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();
        
        //lamp1.ligada = true;
        lamp1.ligar();        
        System.out.println( lamp1.ligada );
        
        
        Ventilador vent1 = new Ventilador();
        vent1.aumentarVelocidade(4);
        System.out.println("Velocidade: " + vent1.consultarVelocidade());
    }
    
}
