package sockets;

import java.net.*;
import java.io.*;

/**
 * Created by User on 02.03.2017.
 */
public class Server {
    public static void main(String[] ar) {
        int port = 7777;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Привет! Я сервер, и я жду тебя, клиент.");

            Socket socket = ss.accept(); // Клиент законнектился
            System.out.println("А вот и клиент. Его IP: " + socket.getInetAddress());
            System.out.println();

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line = null;
            while (true) {
                line = in.readUTF(); // ожидаем пока клиент пришлет строку текста
                System.out.println("Клиент отправил строку текста: " + line);
                System.out.println("А я ему её обратно...");
                out.writeUTF(line); // отсылаем клиенту обратно ту самую строку текста
                out.flush(); // заставляем поток закончить передачу данных
                System.out.println("Ждём еще сообщений...");
                System.out.println();
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
    static {

    }

}