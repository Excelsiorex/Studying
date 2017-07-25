package cryptography;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String md5 = MD5.getMD5FromString(str);
        System.out.println(md5);

        String sha256 = SHA256.getSHA256FromString(str);
        System.out.println(sha256);
    }
}
