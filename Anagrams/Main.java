package Anagrams;

import java.util.Scanner;


public class Main {

    private static int numberNeeded(String first, String second) {
        int count = 0;
        int[] freq = new int[26];
        for (char c : first.toCharArray()) freq[c - 'a']++;
        for (char c : second.toCharArray()) freq[c - 'a']--;
        for (int i : freq) count += Math.abs(i);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
