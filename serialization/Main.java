package serialization;

import java.io.*;
import java.util.Date;

public class Main {
    private static String filepath = "serialization/Serialization.txt";

    public static void main(String[] args) {
        CurrentDate before = new CurrentDate(new Date());
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filepath))) {
            objectOutputStream.writeObject(before);
            System.out.println("Successful serialization");

            Thread.sleep(3000);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filepath));
            CurrentDate after = (CurrentDate) objectInputStream.readObject();
            System.out.println("Successful deserialization");

            System.out.println();
            System.out.println("Serialized object is " + before);
            System.out.println("Deserialized object is " + after);
            System.out.println("Are they equal? " + before.equals(after));
            System.out.println("Current date " + new Date());
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
