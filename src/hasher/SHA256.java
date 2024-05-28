package hasher;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 implements IHasher {
    private static SHA256 instance;

    private SHA256(){

    }

    public static SHA256 getInstance(){
        if(instance==null){
            instance=new SHA256();
        }
        return instance;
    }

    @Override
    public String hash(String password) {
            MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA3-256");
        }catch (NoSuchAlgorithmException e){
            System.out.println("There was an error retrieving the algorithm!");
        }
        final byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        return new String(bytesToHex(hash));
    }

    public static String bytesToHex(byte[] bytes) {
        final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
