package atividade.sockets.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class TCPClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        int port = 4500;
        Socket socket = new Socket("localhost", port);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String entradaServidor = "";
        String entradaUsuario = JOptionPane.showInputDialog(null, "Digite os seguintes dados: \n Nome - Valor do abastecimento - "
                        + "Tipo de combustivel: ");

        while(!entradaUsuario.equalsIgnoreCase("sair")) {
                out.println(entradaUsuario);
                entradaServidor = in.readLine();
                entradaUsuario = JOptionPane.showInputDialog(null, "Digite os seguintes dados: \n Nome do cliente - "
                                + "Valor do abastecimento - "
                                + "Tipo de combustivel: ");
        }

            out.close();
            in.close();
            socket.close();
    }
}
