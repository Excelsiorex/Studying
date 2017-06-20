package substring_comparisons;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * We define the following terms:
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
 * A < B < ... < Y < Z < a < b < ... < y < z
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length .
 */
class Comparison_1 {
    private static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        int count = s.length() - k + 1;
        SortedSet<String> sets = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            sets.add(s.substring(i, i + k));
        }
        smallest = sets.first();
        largest = sets.last();
        return smallest + "\n" + largest;
    }

    static void getResult() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
