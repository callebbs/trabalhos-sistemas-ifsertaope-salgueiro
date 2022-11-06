package aula.sockets.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------");
        System.out.println(":: Cliente Iniciado ::");
        System.out.println("----------------------");
        
        int port = 5000;
        
        Socket socket = new Socket("localhost", port);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        EscutaThread escuta = new EscutaThread(in);
        escuta.start();
        
        String entrada;
        
        while(true) {
            entrada = JOptionPane.showInputDialog(null, "Mensagem para o servidor", "Cliente", 
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Cliente: " + entrada);
            out.println(entrada);
        }
        
        
    }
    
}
