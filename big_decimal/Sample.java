package big_decimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed
 * in the exact same format as it was read from stdin, meaning that is .1 printed as .1, and 0.1 is printed as 0.1.
 * If two numbers represent numerically equivalent values (e.g., .1 = 0.1), then they must be listed in the same order as they were received as input).
 * Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.
 */
public class Sample {
    public static void getResult() {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, 0, n, Collections.reverseOrder((a1, a2) -> {
            BigDecimal a = new BigDecimal(a1);
            BigDecimal b = new BigDecimal(a2);
            return a.compareTo(b);
        }));

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
