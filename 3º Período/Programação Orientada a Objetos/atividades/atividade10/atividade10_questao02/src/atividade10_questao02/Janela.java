package atividade10_questao02;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
    private JButton butRed, butBlue, butGreen;
    private Container painel = getContentPane();
    
    public Janela() {
        setTitle("Janela de Cores");
        painel.setBackground(Color.white);
        setLayout(new FlowLayout());
        
        butRed = new JButton("Vermelho");
        butRed.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        painel.setBackground(Color.red);
                    }
                }
        );
        add(butRed);
        
        butBlue = new JButton("Azul");
        butBlue.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        painel.setBackground(Color.blue);
                    }
                }
        );
        add(butBlue);
        
        butGreen = new JButton("Verde");
        butGreen.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        painel.setBackground(Color.green);
                    }
                }
        );
        add(butGreen);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        setResizable(false);
        
    }
    
}
