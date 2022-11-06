package lista02_questao02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JLabel labNomePrograma;
    private JTextField tefQtdJogos;
    private JButton butGerar;
    private JTextArea teaJogos;
    
    public Janela() {
        setTitle("Gerador de Números da Mega Sena");
        setLayout(new FlowLayout());
        
        
        labNomePrograma = new JLabel("Quantidade de jogos");
        add(labNomePrograma);
        
        tefQtdJogos = new JTextField(5);
        add(tefQtdJogos);
        
        butGerar = new JButton("Gerar");
        butGerar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        teaJogos.setText("");
                        int qtdJogos = Integer.parseInt(tefQtdJogos.getText());
                        for (int i = 1; i <= qtdJogos; i++) {
                            teaJogos.append(
                                    "Jogo " + i + "\n" + Jogos.gerarJogo() + " \n");
                        }
                        
                    }
                }
        );
        add(butGerar);
        
        teaJogos = new JTextArea(50, 30);
        teaJogos.setEditable(false);
        add(teaJogos);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setResizable(false);
        setVisible(true);
    }
    
}
