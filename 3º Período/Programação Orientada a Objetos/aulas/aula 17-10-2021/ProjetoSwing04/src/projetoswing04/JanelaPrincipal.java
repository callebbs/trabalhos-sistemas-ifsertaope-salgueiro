package projetoswing04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame {
    
    private JButton butSegundaJanela, butCorJanela2;
    private Janela2 frame;
    
    public JanelaPrincipal() {    
        setTitle("Janela Principal");
        setLayout(new FlowLayout());
        
        frame = new Janela2();
        
        butSegundaJanela = new JButton("Segunda Janela");
        butSegundaJanela.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(true);
                    }
                }
        );
        add(butSegundaJanela);
        
        butCorJanela2 = new JButton("Cor da Janela 2");
        butCorJanela2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.getContentPane().setBackground(Color.red);
                        frame.setLabTeste("Mudei");
                    }
                }
        );
        add(butCorJanela2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }
}
