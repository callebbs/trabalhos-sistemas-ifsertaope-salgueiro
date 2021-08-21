package projetoswing03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JTextField tefNome;
    private JButton butOk;
    
    
    public Janela() {
        setLayout(new FlowLayout());
        
        tefNome = new JTextField(20);
        add(tefNome);
        
        butOk = new JButton("Ok");
        butOk.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        String nome = tefNome.getText();
                        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
                    }
                }
        );
        add(butOk);
        
        
       
        setTitle("Classes Internas Anônimas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
        
    }
    
}