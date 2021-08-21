package projetoswing01;

import javax.swing.JFrame;

public class Janela extends JFrame {
    
    public Janela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fecha a janela através do X
        setSize(500, 300);
        //define o tamanho da janela
        setVisible(true);
        //torna a janela visível
    }
    
}
