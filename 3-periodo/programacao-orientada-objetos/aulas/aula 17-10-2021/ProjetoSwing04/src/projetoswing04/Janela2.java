package projetoswing04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela2 extends JFrame {
    private JLabel labTeste;
    private JButton butFechar, butLimpar;
    private JTextField tefNome;
    
    
    public Janela2() {
        setTitle("Segunda Janela");
        setLayout(new FlowLayout());
        
        labTeste = new JLabel("Testando a segunda janela.");
        add(labTeste);
        
        butFechar = new JButton("Fechar");
        butFechar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Deixa a janela invisível, porém rodando na memória
                        setVisible(false);
                    }
                }
        );
        add(butFechar);
        
        tefNome = new JTextField(20);
        add(tefNome);
        
        butLimpar = new JButton("Limpar texto");
        butLimpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        tefNome.setText("");
                    }
                }
        );
        add(butLimpar);
        
        //Hide on Close - esconde a janela
        //Dispose on close - fecha a janela e remove da memória
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        //setVisible(true);
    }
    
    public void setLabTeste(String s) {
        labTeste.setText(s);
    }
}
