import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    private static final int PORT = 34522;
    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                try (
                        Socket socket = server.accept(); // принимаем нового клиента
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {
                    String msg = input.readUTF(); // прочитать сообщение от клиента
                    output.writeUTF("Hello, " + msg); // отправить сообщение клиенту
                    System.out.println(msg + " came to us");

                    output.writeUTF("enter x" ); // отправить сообщение клиенту
                    msg = input.readUTF();
                    double x = Double.parseDouble(msg);

                    output.writeUTF("enter y" ); // отправить сообщение клиенту
                    msg = input.readUTF();
                    double y = Double.parseDouble(msg);

                    double ans = (3*Math.cos(x - Math.PI)*Math.cos(x - Math.PI)/(0.5 + Math.sin(y*y)));
                    output.writeUTF("ans = " + ans);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
