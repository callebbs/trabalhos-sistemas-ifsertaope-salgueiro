package projetoswing01;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JLabel meuLabel1, meuLabel2;
    private JTextField meuField;
    
    public Janela() {
        //construtor do JFrame
        //transforma o texto do método no título da janela
        super("Minha Janela Swing");
        setLayout(new FlowLayout());
        
        meuLabel1 = new JLabel("Exemplo de Label");
        add(meuLabel1);
        
        meuField = new JTextField(20);
        add(meuField);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fecha a janela através do X
        setSize(500, 300);
        //define o tamanho da janela
        setVisible(true);
        //torna a janela visível
    }
    
}
