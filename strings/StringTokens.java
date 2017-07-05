package strings;

import java.util.Objects;
import java.util.Scanner;

/**
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
 */
class StringTokens {
    static void getResult() {
        int counter = 0;

        Scanner scan = new Scanner(System.in);
        String s;
        s = scan.nextLine().trim();
        scan.close();

        String[] str = s.split("[ !,?._'@]+");
        for (String s1 : str) {
            if (!Objects.equals(s1, "")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (String s1 : str) {
            System.out.println(s1);
        }
    }
}
