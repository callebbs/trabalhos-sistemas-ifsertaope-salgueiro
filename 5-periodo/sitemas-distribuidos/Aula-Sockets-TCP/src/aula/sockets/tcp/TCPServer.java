package aula.sockets.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

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
        
        String entrada;
        
        while((entrada = in.readLine()) != null) {
            System.out.println("Recebido do cliente: " + entrada);
            out.println(entrada.toUpperCase());
            if(entrada.equalsIgnoreCase("sair")) {
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
