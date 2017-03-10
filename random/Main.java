package random;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[10];
        for(int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(ints));
    }
}
