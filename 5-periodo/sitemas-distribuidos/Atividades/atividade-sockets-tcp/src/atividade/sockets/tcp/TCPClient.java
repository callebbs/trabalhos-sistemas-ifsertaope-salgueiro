package atividade.sockets.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        int port = 5000;
        Socket socket = new Socket("localhost", port);
        
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        String entradaNome, entradaValor, entradaCombustivel, entradaContinuar, entradaServidor;
        
        entradaNome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        entradaValor = JOptionPane.showInputDialog("Digite o valor abasteicdo: ");
        entradaCombustivel = JOptionPane.showInputDialog("Digite o tipo do combustível abastecido:");
        entradaContinuar = JOptionPane.showInputDialog("Continuar adicionando dados?");
        
        while(!entradaContinuar.equalsIgnoreCase("nao")) {
            out.println(entradaNome);
            entradaNome = in.readLine();
            out.println(entradaValor);
            entradaValor = in.readLine();
            out.println(entradaCombustivel);
            entradaCombustivel = in.readLine();
        }
        
        out.close();
        in.close();
        socket.close();
        
    }
    
}
