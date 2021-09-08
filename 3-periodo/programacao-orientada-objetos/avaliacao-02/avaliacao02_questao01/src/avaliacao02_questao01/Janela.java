package avaliacao02_questao01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Janela extends JFrame {
    private JTextField tefPrcProdutos, tefQtdProdutos;
    private JLabel labPrcProdutos, labQtdProdutos, labTotal;
    private JButton butCalc;
    private JPanel teste;
    
    public Janela() {
        setLayout(new FlowLayout());
        
        labPrcProdutos = new JLabel("Preço do Produto");
        add(labPrcProdutos);
        
        tefPrcProdutos = new JTextField(10);
        add(tefPrcProdutos);
        
        labQtdProdutos = new JLabel("Quantidade:");
        add(labQtdProdutos);
        
        tefQtdProdutos = new JTextField(10);
        add(tefQtdProdutos);
        
        butCalc = new JButton("Total a Pagar >>");
        butCalc.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double preco = Double.parseDouble(tefPrcProdutos.getText());
                        double qtd = Double.parseDouble(tefQtdProdutos.getText());
                        double total = preco * qtd;
                        String sTotal = String.valueOf(total);
                        labTotal.setText(sTotal + " reais");
                    }
                }
        );
        add(butCalc);
        
        labTotal = new JLabel("");
        add(labTotal);        
        
        setSize(450, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
