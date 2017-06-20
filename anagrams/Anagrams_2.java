package anagrams;

import java.util.*;

/**
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * Complete the function in the editor. If a and b are case-insensitive anagrams, return true; otherwise, return false instead.
 */
class Anagrams_2 {
    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String aa = a.toLowerCase();
        String bb = b.toLowerCase();
        Map<Character, Integer> a_count = new HashMap<>();
        Map<Character, Integer> b_count = new HashMap<>();

        for (int i = 0; i < aa.length(); i++) {

            // Count all characters in string a
            if (a_count.containsKey(aa.charAt(i))) {
                int val = a_count.get(aa.charAt(i));
                a_count.put(aa.charAt(i), ++val);
            } else {
                a_count.put(aa.charAt(i), 1);
            }

            // Count all characters in string b
            if (b_count.containsKey(bb.charAt(i))) {
                int val = b_count.get(bb.charAt(i));
                b_count.put(bb.charAt(i), ++val);
            } else {
                b_count.put(bb.charAt(i), 1);
            }
        }

        if (a_count.size() != b_count.size()) {
            return false;
        }

        // For every key
        for (char c : Arrays.toString(a_count.keySet().toArray()).toCharArray()) {
            if (!Objects.equals(a_count.get(c), b_count.get(c))) {
                return false;
            }
        }
        return true;
    }


    static void checkAnagram() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
