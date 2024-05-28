package hasher;

import java.security.NoSuchAlgorithmException;

public interface IHasher  {
    String hash(String password);
}
