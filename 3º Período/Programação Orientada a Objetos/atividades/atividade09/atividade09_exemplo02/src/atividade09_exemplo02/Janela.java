package atividade09_exemplo02;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
    private static int TAM = 5;
    private static final String nomes[] = {"Norte", "Sul", "Leste", "Oeste", "Centro"};
    private JButton buttons[];
    
    public Janela() {
        super("Exemplo BorderLayout");
        this.setLayout(new BorderLayout());
        
        buttons = new JButton[TAM];
        
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Botão " + nomes[i]);
        }
        
        this.add(buttons[0], BorderLayout.NORTH);
        this.add(buttons[1], BorderLayout.SOUTH);
        this.add(buttons[2], BorderLayout.EAST);
        this.add(buttons[3], BorderLayout.WEST);
        this.add(buttons[4], BorderLayout.CENTER);
    }
}
