package anagrams;

import java.util.Scanner;

/**
 * Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.
 * Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.
 * Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.
 */
class Anagrams_1 {
    private static int numberNeeded(String first, String second) {
        int count = 0;
        int[] freq = new int[26];
        for (char c : first.toCharArray()) freq[c - 'a']++;
        for (char c : second.toCharArray()) freq[c - 'a']--;
        for (int i : freq) count += Math.abs(i);
        return count;
    }

    static void checkAnagram() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        System.out.println(numberNeeded(a, b));
    }
}
