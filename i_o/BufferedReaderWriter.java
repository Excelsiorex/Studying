package i_o;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class BufferedReaderExample {
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
}
