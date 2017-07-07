package exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * You will be given two integers x and y as input, you have to compute x/y . If and y are not 32 bit signed integers or if y is zero,
 * exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
 */
class Sample {
    static void getResult() {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
