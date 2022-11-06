package aula.sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JOptionPane;

public class UdpClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            
            byte[] sendData = new byte[1024];
            InetAddress IpAddress = InetAddress.getByName("localhost");
            int port = 5000;
            
            while(true) {
                String sentence = JOptionPane.showInputDialog("Digite algo: ");
                sendData = sentence.getBytes();
                
                DatagramPacket sendPacket = new DatagramPacket(sendData, sentence.length());
                clientSocket.send(sendPacket);
                if(sentence.equalsIgnoreCase("sair")) {
                    break;
                }
            }
            clientSocket.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}