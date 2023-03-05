import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 34522;

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output  = new DataOutputStream(socket.getOutputStream())
        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Who are you?");
            String msg = scanner.nextLine(); // Вася
            output.writeUTF(msg); // отправляем сообщение на сервер
            String receivedMsg = input.readUTF(); // получаем ответ от сервера
            System.out.println("Received from the server: " + receivedMsg); // получено с сервера

            while (!msg.equals("bye")) {
                msg = scanner.nextLine();
                output.writeUTF(msg); // отправляем сообщение на сервер
                if (!msg.equals("bye")) {
                    receivedMsg = input.readUTF(); // получаем ответ от сервера
                    System.out.println("Received from the server: " + receivedMsg); // получено с сервера
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
