package atividade10_questao01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    
    private JLabel labelPeso, labelAltura;
    private JTextField tefPeso, tefAltura;
    private JButton butCalc;
    
    public Janela() {
        setTitle("Calculadora de IMC");
        setLayout(new FlowLayout());

        labelPeso = new JLabel("Seu peso: \n");
        add(labelPeso);
        
        tefPeso = new JTextField(20);
        add(tefPeso);
        
        labelAltura = new JLabel("Sua altura: ");
        add(labelAltura);
        
        tefAltura = new JTextField(10);
        add(tefAltura);
        
        butCalc = new JButton("Calcular");
        butCalc.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double peso = Double.parseDouble(tefPeso.getText());
                        double altura = Double.parseDouble(tefAltura.getText());
                        double imc = peso / (altura * altura);
                        int imcInt;
                        
                        JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round(imc));
                    }
                }
        );
        add(butCalc);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 150);
        setVisible(true);
        setResizable(false);

    }
}
