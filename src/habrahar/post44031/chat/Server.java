package habrahar.post44031.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 1234;
        ServerSocket ss = new ServerSocket(port);
        System.out.println("server is waiting...");
        Socket socket = ss.accept();
        System.out.println("client is accepted");
        InputStream sin = socket.getInputStream();
        OutputStream sout = socket.getOutputStream();

        DataInputStream in = new DataInputStream(sin);
        DataOutputStream out = new DataOutputStream(sout);

        String line;
        while (true) {
            System.out.println("before read");
            line = in.readUTF();
            System.out.println("after read");
            System.out.println(line);
            //out.writeUTF(line);
            //out.flush();
        }
    }
}
