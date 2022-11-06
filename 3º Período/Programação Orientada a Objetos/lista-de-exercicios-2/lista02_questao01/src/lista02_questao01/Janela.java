package lista02_questao01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JLabel labTexto, labTexto2, labTexto3, labTexto4;
    private JTextField tefCaracteres, tefSenha;
    private JButton butGerar;

    public Janela() {
        setTitle("Gerador");
        setLayout(new FlowLayout());
        
        labTexto = new JLabel("Gerador de Senha");
        add(labTexto);
        
        labTexto2 = new JLabel("Quantidade de dígitos: ");
        add(labTexto2);
                
        tefCaracteres = new JTextField(5);
        add(tefCaracteres);
        
        butGerar = new JButton("Gerar Senha");
        butGerar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numChar = Integer.parseInt(tefCaracteres.getText());
                        if (numChar < 6 | numChar > 10) {
                            tefCaracteres.setText("");
                            JOptionPane.showMessageDialog(null, "Escolha um valor entre 6 e 10");
                            tefCaracteres.requestFocus();
                        } else {
                            String newSenha = Senha.gerarSenha(numChar);
                            tefSenha.setText(newSenha);
                            tefSenha.setEditable(false);
                        }
                    }
                }
        );
        add(butGerar);
        
        labTexto3 = new JLabel("**************************************");
        add(labTexto3);
        
        labTexto4 = new JLabel("Senha gerada: ");
        add(labTexto4);
        
        tefSenha = new JTextField(10);
        add(tefSenha);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 200);
        setResizable(false);
        setVisible(true);
    }
}
