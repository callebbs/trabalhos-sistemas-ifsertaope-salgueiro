package atividade11_questao01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Janela extends JFrame {
    private JTextArea texto;
    private JLabel labTitulo;
    private JButton butCorLetra, butCorFundo, butTamFonte;
    private Random rand = new Random();
    
    
    public Janela() {
        setTitle("Gerador de Cores Aleatórias no Texto");
        setLayout(new FlowLayout());
             

        texto = new JTextArea();
        texto.setText(""
                + ""
                + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec varius orci."
                + "Etiam ac fringilla risus. Aliquam metus tellus, tincidunt non rhoncus a, accumsan ac massa."
                + "Cras et elit libero. Fusce commodo dictum augue, et vehicula ex."
                + "Vestibulum posuere accumsan lacus, a tempus justo ornare a."
                + "Cras tincidunt ante turpis, sit amet blandit tortor pretium eu."
                + "Mauris mollis condimentum mollis."
                + "Suspendisse potenti. Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Ut ullamcorper leo neque, quis consequat tellus ultrices vitae. Praesent at tincidunt turpis."
                + "Praesent dignissim viverra nunc, vitae mollis nunc tristique sed. "
                + "Phasellus nibh neque, blandit ut ex a, sodales viverra ligula. Sed volutpat arcu in molestie commodo."
                + "Donec pellentesque porta velit, vitae egestas sapien mattis in."
                + "Aliquam vestibulum non enim quis iaculis."
                + "In finibus dignissim ante, ut sodales lacus congue ac."
                + "Vestibulum sed urna semper, convallis dolor sit amet, dictum urna. Morbi rhoncus euismod justo a posuere. "
                + "");
        texto.setLineWrap(true);
        texto.setBounds(50, 50, 500, 300 );
        texto.setWrapStyleWord(true);
        texto.setBorder(BorderFactory.createBevelBorder(1));
        texto.setEditable(false);
        add(texto);
        
        butCorLetra = new JButton("Alterar Cor da Letra");
        butCorLetra.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int corR = rand.nextInt(255 + 1 - 0) + 0;
                        int corG = rand.nextInt(255 + 1 - 0) + 0;
                        int corB = rand.nextInt(255 + 1 - 0) + 0;
                        texto.setForeground(new Color(corR, corG, corB));
                    }
                }
        );
        add(butCorLetra);
        
        butCorFundo = new JButton("Alterar Cor de Fundo");
        butCorFundo.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int corR = rand.nextInt(255 + 1 - 0) + 0;
                        int corG = rand.nextInt(255 + 1 - 0) + 0;
                        int corB = rand.nextInt(255 + 1 - 0) + 0;
                        texto.setBackground(new Color(corR, corG, corB));
                    }
                }
        );
        add(butCorFundo);
        
        butTamFonte = new JButton("Mudar a fonte");
        butTamFonte.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        texto.setFont(new Font("Verdana", Font.BOLD,15));
                    }
                }
        );
        add(butTamFonte);
        
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 450);
        setVisible(true);
    }
    
}
