package projetoswingmedia;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JTextField tefNota1, tefNota2;
    private JButton butOk;
    
    
    public Janela() {
        setLayout(new FlowLayout());
        
        tefNota1 = new JTextField(10);
        add(tefNota1);
        
        tefNota2 = new JTextField(10);
        add(tefNota2);
        
        butOk = new JButton("Ok");
        butOk.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        /**
                        String sNota1 = tefNota1.getText();
                        String sNota2 = tefNota2.getText();
                        **/
                        //para redução de variáveis:
                        
                        double nota1 = Double.parseDouble(tefNota1.getText());
                        double nota2 = Double.parseDouble(tefNota2.getText());
                        double media = (nota1 + nota2) / 2;
                        
                        
                        JOptionPane.showMessageDialog(null, "Sua média é: " + media);
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