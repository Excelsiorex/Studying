package toString;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a;
        double b;
        String s;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Integer number a: ");
            a = scanner.nextInt();

            System.out.print("Double number b: ");
            b = scanner.nextDouble();

            System.out.print("String number s: ");
            scanner.nextLine(); // for correctly reading next line
            s = scanner.nextLine();

            Example_2 example2 = new Example_2(a, b, s);
            System.out.println(example2);
        } catch (Exception e) {
            System.out.println("Incorrect input: " + e.toString());
        }
    }
}
