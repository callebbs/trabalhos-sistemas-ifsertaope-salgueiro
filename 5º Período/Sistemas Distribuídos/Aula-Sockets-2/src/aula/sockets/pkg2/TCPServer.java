package aula.sockets.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-----------------------");
        System.out.println(":: Servidor Iniciado ::");
        System.out.println("-----------------------");
        
        int port = 5000;
        
        ServerSocket socketServidor = new ServerSocket(port);
        Socket socketClient = socketServidor.accept();
        
        PrintWriter out = new PrintWriter(socketClient.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
        
        EscutaThread escuta = new EscutaThread(in);
        escuta.start();
        String entrada;
        
        while(true) {
            entrada = JOptionPane.showInputDialog(null, "Mensagem para o cliente", "Servidor", 
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Servidor: " + entrada);
            out.println(entrada);
        }
        
        
    }
    
}
