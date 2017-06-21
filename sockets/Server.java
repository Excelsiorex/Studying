package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] ar) {
        int port = 7777;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Привет! Я сервер, и я жду клиентов.");

            Socket socket = ss.accept(); // Клиент законнектился
            System.out.println("А вот и клиент. Его IP: " + socket.getInetAddress());
            System.out.println();

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line;
            while (true) {
                line = in.readUTF(); // ожидаем пока клиент пришлет строку текста
                System.out.println(socket.getInetAddress() + ": " + line);
                out.writeUTF("Твой текст: " + line + " и твой IP: " + socket.getInetAddress()); // ответ клиенту
                out.flush(); // заставляем поток закончить передачу данных
                // Ждём сообщений
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}