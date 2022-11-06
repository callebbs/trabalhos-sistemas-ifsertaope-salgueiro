package aula010.pkg01;

import javax.swing.JOptionPane;

public class Aula01001 {

    public static void main(String[] args) {
        
        /*
        String msg = "Olá, pessoal!\nDesejo uma boa noite para todos vocês.";
        
        JOptionPane.showMessageDialog(null, msg, "Saudação", JOptionPane.INFORMATION_MESSAGE);
        */
        
        /*
        
        Mostrando itens na caixa de diálogo
        
        String msg = "";
        
        for(int i = 1; i <= 5; i++) {
            msg += i + "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        
        */
        
        
        /*
        
        Recebendo um nome
                
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
                
        JOptionPane.showMessageDialog(null, "Olá, "+ nome + "!");
        */
        
        // Usando algoritmo de média com caixas de diálogo
        
        /*
        double nota1, nota2, media;
        
        String sNota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String sNota2 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        
        nota1 = Double.parseDouble(sNota1);
        nota2 = Double.parseDouble(sNota2);
        
        media = (nota1 + nota2) / 2;
        
        JOptionPane.showMessageDialog(null, "Sua média é: " + media);
        */
        
        // Capturando a opção da interface
        
        int op = JOptionPane.showConfirmDialog(null,
                "Você gosta de Java?",
                "Tipo de Programador",
                JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(op == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Eu também gosto de Java.");
        } else if (op == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Então vá programar em Python!");
        } else {
            JOptionPane.showMessageDialog(null, "Isentão");
        }
        
    }
    
}
