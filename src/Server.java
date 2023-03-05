import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT = 34522;
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("The server is running and ready to work...");
            while (true) {
                try (
                        Socket socket = server.accept(); // принимаем нового клиента
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {
                    String msg = input.readUTF(); // прочитать сообщение от клиента
                    String name = msg;
                    output.writeUTF("Hello, " + msg); // отправить сообщение клиенту
                    System.out.println(msg + " came to us");
                    int count = 0;

                    while (!msg.equals("bye")) {
                        msg = input.readUTF();
                        count++;
                        if (!msg.equals("bye")) {
                            output.writeUTF("#" + count + " :" + msg); // получаем ответ от сервера
                            System.out.println("new message " + count + " :" + msg);
                        } else {
                            System.out.println("bye " + name);
                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
