package atividade.sockets.tcp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        
        System.out.println("\n---------------------------");
        System.out.println("\n:: Servidor TCP Iniciado ::");
        System.out.println("\n---------------------------");
        
        int port = 5000;
        
        ServerSocket socketServidor = new ServerSocket(port);
        Socket socketClient = socketServidor.accept();
        PrintWriter out = new PrintWriter(socketClient.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
              
        FileWriter arquivo = new FileWriter("registro.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        String entrada[] = new String[3];
        
        for(int i = 0; i <= entrada.length; i++) {
            if((entrada[i] = in.readLine()) != null) {
                System.out.println("Dados do cliente: " + entrada[i]);
                out.println(entrada[i]);
                gravar.write("Dados do cliente: " + entrada);
            } else {
                break;
            }
        }
        
        
        out.close();
        in.close();
        socketClient.close();
        socketServidor.close();
        
        System.out.println("\n-----------------------------");
        System.out.println("\n:: Servidor TCP Finalizado ::");
        System.out.println("\n-----------------------------");
    }
    
}
