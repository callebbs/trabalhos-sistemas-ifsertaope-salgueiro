package atividade11_questao02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Janela extends JFrame {
    private JComboBox cmbDias;
    private JLabel labDias;
    private JButton butOk;
    
    public Janela() {
        setLayout(new FlowLayout());
        setTitle("JComboBox");
        
        labDias = new JLabel("Escolha um dia da semana:");
        add(labDias);
        
        cmbDias = new JComboBox();
        add(cmbDias);
        cmbDias.addItem("Segunda-feira");
        cmbDias.addItem("Terça-feira");
        cmbDias.addItem("Quarta-feira");
        cmbDias.addItem("Quinta-feira");
        cmbDias.addItem("Sexta-feira");
        cmbDias.addItem("Sábado");
        cmbDias.addItem("Domingo");
        
        butOk = new JButton("OK");
        butOk.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Você selecionou: " + String.valueOf(cmbDias.getSelectedItem()));
                    }
                }
        );
        add(butOk);
        
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
}
