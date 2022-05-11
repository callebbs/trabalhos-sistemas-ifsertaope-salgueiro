package aula.sockets.multithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TCPServer {
    public static void main(String[] args) {
            System.out.println("-------------------------");
            System.out.println(":: Server TCP Iniciado ::");
            System.out.println("-------------------------");
            
            int port = 5000;
            try {
                ServerSocket socketServidor = new ServerSocket(port);
                Socket socketCliente = socketServidor.accept();
                
                PrintWriter out = new PrintWriter(socketCliente.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
                
                EscutaThread escuta = new EscutaThread(in);
                escuta.start();
                
                String entrada;
                
                while(true) {
                    entrada = JOptionPane.showInputDialog(null, "Mensagem para o cliente", "Servidor",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Serdividor: " + entrada);
                    out.println(entrada);
                }
                        
            } catch (IOException e) {
                e.printStackTrace();
                
            }
    }
    
}
