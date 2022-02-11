package test;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9000);

        socket.getOutputStream().write("HelloServer".getBytes(StandardCharsets.UTF_8));
        socket.getOutputStream().flush();

        byte[] bytes = new byte[1024];

        socket.getInputStream().read(bytes);
        System.out.println("receive from server client:" + new String(bytes));
        socket.close();
    }
}
