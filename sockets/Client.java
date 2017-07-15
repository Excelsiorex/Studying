package sockets;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


class Client {
    public static void main(String[] ar) {
        int serverPort = 7777; // здесь обязательно нужно указать порт к которому привязывается сервер
        String address = "127.0.0.1"; // это IP-адрес компьютера, где исполняется наша серверная программа

        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println("Кто-нибудь слышал про сокет с IP " + address + " и портом " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера
            System.out.println("Ладно, проходи!");

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиентом
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // Создаем поток для чтения с клавиатуры.
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line;
            System.out.println("Введите что-нибудь и это отправится на сервер.");

            while (true) {
                line = keyboard.readLine(); // ждем пока пользователь введет что-то и нажмет кнопку Enter
                out.writeUTF(line); // отсылаем введенную строку текста серверу
                out.flush(); // заставляем поток закончить передачу данных
                line = in.readUTF(); // ждем пока сервер отошлет строку текста
                System.out.println(line);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
