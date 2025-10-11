import java.util.Scanner;
import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String[] arsg) throws IOException {
        Scanner sc = new Scanner(System.in);
        int port = 5000;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket.getInetAddress());
        sc.close();
    }
}
