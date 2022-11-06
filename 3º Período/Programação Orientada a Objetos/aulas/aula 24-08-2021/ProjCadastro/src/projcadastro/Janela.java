package projcadastro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JLabel labNome, labMedia;
    private JTextField tefNome, tefMedia;
    private JButton butListar, butSalvar;
    private ArrayList<Aluno> listaDeAlunos;
    
    public Janela() {
        listaDeAlunos = new ArrayList<>();
        
        setTitle("Cadastro");
        setLayout(new FlowLayout());
        
        labNome = new JLabel("Nome: ");
        add(labNome);
        
        tefNome = new JTextField(20);
        add(tefNome);
        
        labMedia = new JLabel("Média: ");
        add(labMedia);
        
        tefMedia = new JTextField(20);
        add(tefMedia);
        
        butListar = new JButton("Listar");
        butListar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String msg = "";
                        for(Aluno a: listaDeAlunos) {
                            msg += "Nome: " + a.getNome() 
                                    + "\nMédia: " + a.getMedia()
                                    + "\n\n";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    }
                }
        );
        add(butListar);
        
        butSalvar = new JButton("Salvar");
        butSalvar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Aluno aluno = new Aluno();
                        aluno.setNome(tefNome.getText());
                        aluno.setMedia(Double.parseDouble(tefMedia.getText()));
                        listaDeAlunos.add(aluno);
                        tefNome.setText("");
                        tefMedia.setText("");
                        JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
                        tefNome.requestFocus();
                    }
                }
        );
        add(butSalvar);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(320, 150);
        setResizable(false);
    }
}
