/*
Desenvolva uma classe Java para representar uma lâmpada. 
A lâmpada pode estar ligada ou desligada. 
No método main() da classe principal você deve: 
    a) instanciar um objeto do tipo lâmpada;
    b) ligar a lâmpada;
    c) imprimir na tela o estado atual da lâmpada;
    d) desligar a lâmpada;
    e) imprimir novamente o seu estado.
*/

package atividade05_questao02;

public class Atividade05_questao02 {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        System.out.println("Interruptor apertado.");
        lampada.ligar();
        System.out.println("A lampada está: " + lampada.estado);
        System.out.println("Interruptor apertado.");
        lampada.desligar();
        System.out.println("A lâmpada está: " + lampada.estado);
    }
}
