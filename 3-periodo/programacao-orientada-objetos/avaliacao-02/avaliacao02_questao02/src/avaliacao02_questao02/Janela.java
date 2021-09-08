package avaliacao02_questao02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JLabel labLado1, labLado2, labLado3;
    private JTextField tefLado1, tefLado2, tefLado3;
    private JButton butVerificar;
    
    public Janela() {
        setLayout(new FlowLayout());
        
        labLado1 = new JLabel("Lado 1");
        add(labLado1);
        
        tefLado1 = new JTextField(10);
        add(tefLado1);
        
        labLado2 = new JLabel("Lado 2");
        add(labLado2);
        
        tefLado2 = new JTextField(10);
        add(tefLado2);
        
        labLado3 = new JLabel("Lado 3");
        add(labLado3);
        
        tefLado3 = new JTextField(10);
        add(tefLado3);
        
        butVerificar = new JButton("Verificar...");
        butVerificar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double lado1 = Double.parseDouble(tefLado1.getText());
                        double lado2 = Double.parseDouble(tefLado2.getText());
                        double lado3 = Double.parseDouble(tefLado3.getText());
                        
                        if (lado2 - lado3 < lado1 && lado1 < lado2 + lado3) {
                            if (lado1 == lado2 && lado1 == lado3) {
                                JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
                            } else if (lado1 == lado2 && lado1 != lado3) {
                                JOptionPane.showMessageDialog(null, "Triangulo Isósceles.");
                            } else if (lado1 != lado2 & lado1 != lado3) {
                                JOptionPane.showMessageDialog(null, "Triangulo Escaleno.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Triangulo não pôde ser formado.");
                        }
                    }
                }
        );
        add(butVerificar);
        
        setTitle("Triângulos");
        setSize(220, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
}
