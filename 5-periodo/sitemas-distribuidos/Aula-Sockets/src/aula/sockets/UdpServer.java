package aula.sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws SocketException {
        try {
            System.out.println("\n---------------------------");
            System.out.println("\n:: Servidor UDP Iniciado ::");
            System.out.println("\n---------------------------");
            DatagramSocket serverSocket = new DatagramSocket(5000);
            
            while(true) {
                byte[] receivedData = new byte[1024];
                DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
                serverSocket.receive(receivedPacket);
                
                String sentence = new String(receivedPacket.getData());
                if(sentence.substring(0, 4).equalsIgnoreCase("sair")) {
                    break;
                }
                InetAddress IpAddress = receivedPacket.getAddress();
                System.out.println("Recebido de " + IpAddress.getHostAddress() +": " + sentence.trim());
            }
            serverSocket.close();
            System.out.println("\n-----------------------------");
            System.out.println("\n:: Servidor UDP finalizado ::");
            System.out.println("\n-----------------------------");
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
        
    }
    
}
