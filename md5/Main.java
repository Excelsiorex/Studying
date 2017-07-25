package md5;

import java.util.Scanner;

/**
 * Given an alphanumeric string, str, denoting a password, compute and print its MD5 encryption value.
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String md5 = MD5.getMD5FromString(str);
        System.out.println(md5);
    }
}
