package i_o;

import java.io.RandomAccessFile;

class RandomAccessFileExample {
    static void randomAccess() {
        try {
            // Initialization
            RandomAccessFile file = new RandomAccessFile("i_o/TextFile1.txt", "r");

            // Full reading
            System.out.println("FULL READING:");
            byte[] bytes = new byte[(int) file.length()];
            file.readFully(bytes);
            for (byte b : bytes) {
                System.out.print(((char) b));
            }
            System.out.println();

            // Not full reading
            System.out.println("NOT FULL READING:");
            file.seek(4); // from
            int c;
            while ((c = file.read()) != -1) {
                System.out.print((char) c);
            }

            // End of working
            file.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
