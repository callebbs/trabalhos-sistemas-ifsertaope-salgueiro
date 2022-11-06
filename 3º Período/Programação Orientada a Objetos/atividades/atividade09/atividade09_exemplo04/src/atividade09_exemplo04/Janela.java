package atividade09_exemplo04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Janela extends JFrame {
    private JLabel jLabelNota1, jLabelNota2;
    private JTextField jTextFieldNota1, jTextFieldNota2;
    private JButton jButtonOk;
    private JPanel jPanelBorder, jPanelGrid, jPanelFlow;
    
    public Janela() {
        super("Exemplo Múltiplos Layouts");
        
        this.setLayout(new FlowLayout());
        
        jPanelGrid = new JPanel();
        jPanelGrid.setLayout(new GridLayout(2, 2));
        
        jLabelNota1 = new JLabel("Nota 1: ");
        jPanelGrid.add(jLabelNota1);
        
        jTextFieldNota1 = new JTextField(10);
        jPanelGrid.add(jTextFieldNota1);
        
        jLabelNota2 = new JLabel("Nota 2: ");
        jPanelGrid.add(jLabelNota2);
        
        jTextFieldNota2 = new JTextField(10);
        jPanelGrid.add(jTextFieldNota2);
        
        jPanelFlow = new JPanel();
        jPanelFlow.setLayout(new FlowLayout());
        
        jButtonOk = new JButton("OK");
        jPanelFlow.add(jButtonOk);
        
        jPanelBorder = new JPanel();
        jPanelBorder.setLayout(new BorderLayout());
        jPanelBorder.add(jPanelGrid, BorderLayout.CENTER);
        jPanelBorder.add(jPanelFlow, BorderLayout.SOUTH);
        
        this.add(jPanelBorder);
        
    }
    
    
}
