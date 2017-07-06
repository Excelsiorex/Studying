package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The username can contain alphanumeric characters and/or underscores(_).
 * The username must start with an alphabetic character.
 */
class UsernameChecker {
    static void getResult() {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();
            String pattern = "^[aA-zZ]\\w{7,29}$";

            Pattern p = Pattern.compile(pattern);
            Matcher matcher = p.matcher(username);
            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
