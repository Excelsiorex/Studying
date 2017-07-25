package cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SHA256 {
    static String getSHA256FromString(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
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
