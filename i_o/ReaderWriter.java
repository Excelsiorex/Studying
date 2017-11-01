package i_o;

import java.io.*;
import java.util.Scanner;

class ReaderWriter {
    static void reader() {
        try {
            Reader reader1 = new FileReader("i_o/TextFile1.txt");
            Reader reader2 = new FileReader("i_o/TextFile2.txt");
            readBytes(reader1);
            readBytes(reader2);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBytes(Reader reader) throws IOException {
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println();
    }

    static void writer() {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("i_o/TextFile1.txt");
        File file2 = new File("i_o/TextFile2.txt");
        FileWriter writer1 = null;
        FileWriter writer2 = null;
        try {
            writer1 = new FileWriter(file1);
            writer2 = new FileWriter(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        rewriteFile(scanner, writer1);
        rewriteFile(scanner, writer2);
        scanner.close();
    }

    private static void rewriteFile(Scanner scanner, FileWriter writer) {
        System.out.println("FILE WRITING HAS BEEN STARTED: ");
        if (writer != null) {
            String string = scanner.nextLine();
            try {
                while (!string.equals("EOF")) {
                    writer.append(string).append("\n");
                    string = scanner.nextLine();
                }
                System.out.println("FILE WRITING HAS BEEN STOPPED");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
