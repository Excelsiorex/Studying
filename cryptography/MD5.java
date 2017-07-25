package cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Given an alphanumeric string, str, denoting a password, compute and print its MD5 encryption value.
 */
class MD5 {
    static String getMD5FromString(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder out = new StringBuilder();
            for (byte b : digest) {
                out.append(String.format("%02x", b));
            }
            return out.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
