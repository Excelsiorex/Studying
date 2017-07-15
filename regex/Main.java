package regex;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        String string = "hello, regex";
        if (matchString(string)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean matchString(String str) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            System.out.print(str.substring(m.start(), m.end()) + "*");
            Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        }
        return m.matches();
    }
}
