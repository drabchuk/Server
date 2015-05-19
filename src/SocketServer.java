import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketServer {
    final static int NUMBER_OF_PLAYERS = 6;
    ServerSocket ss;
    int port = 1488;
    InputStream[] sin = new InputStream[NUMBER_OF_PLAYERS];
    OutputStream[] sout = new OutputStream[NUMBER_OF_PLAYERS];
    DataInputStream[] in = new DataInputStream[NUMBER_OF_PLAYERS];
    DataOutputStream[] out = new DataOutputStream[NUMBER_OF_PLAYERS];
    int count = 0;
    Socket[] players = new Socket[NUMBER_OF_PLAYERS];
    String[] login = new String[NUMBER_OF_PLAYERS];
    SocketServer(){
        try {
            ss = new ServerSocket(port); // создаем сокет сервера и привязываем его к вышеуказанному порту
            System.out.println("Waiting for a clients...");
            for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
                players[i] = null;
                login[i] = null;
            }
        } catch(Exception x) { x.printStackTrace(); }
    }
}
