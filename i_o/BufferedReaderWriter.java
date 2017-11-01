package i_o;

import java.io.*;

class BufferedReaderWriter {
    static void bufferedReader() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("i_o/TextFile1.txt"));
            String s;
            StringBuilder sb = new StringBuilder();

            while ((s = bufferedReader.readLine()) != null) {
                sb.append(s).append("\n");
            }
            System.out.print(sb.toString());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    static void bufferedWriter() {
        try {
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader("i_o/TextFile1.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("i_o/TextFile2.txt", true));

            // Read file "TextFile1.txt"
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = bufferedReader1.readLine()) != null) {
                sb.append(s).append("\n");
            }

            // Write to file "TextFile2.txt"
            bufferedWriter.write(sb.toString());

            bufferedReader1.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
