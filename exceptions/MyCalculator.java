package exceptions;

import java.util.Scanner;

/**
 * Create a class MyCalculator which consists of a single method power(int,int). This method takes two integers, n and p, as parameters
 * and finds n^p. If either n or p is negative, then the method must throw an exception which says "n and p should be non-negative".
 */
class MyCalculator {
    static void getResult() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    private static int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}
