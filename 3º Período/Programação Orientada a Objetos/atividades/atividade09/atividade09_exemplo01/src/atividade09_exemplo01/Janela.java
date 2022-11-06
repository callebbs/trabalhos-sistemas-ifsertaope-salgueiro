package atividade09_exemplo01;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;


public class Janela extends JFrame {
    private final int TAM = 5;
    private JButton buttons[];
    
    public Janela(){
        super("Exemplo FlowLayout");
        
        this.setLayout(new FlowLayout());
        
        buttons = new JButton [TAM];
        
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Botão " + i);
            this.add(buttons[i]);
        }
    }
    
    
}
