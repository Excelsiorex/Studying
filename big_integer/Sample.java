package big_integer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 * Use the power of Java's Sample class and solve this problem.
 */
class Sample {
    static void getResult() {
        BigInteger bigInteger_1, bigInteger_2;
        Scanner scanner = new Scanner(System.in);
        bigInteger_1 = scanner.nextBigInteger();
        bigInteger_2 = scanner.nextBigInteger();
        scanner.close();
        System.out.println(bigInteger_1.add(bigInteger_2));
        System.out.println(bigInteger_1.multiply(bigInteger_2));
    }

    static void isProbablyPrime() {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
