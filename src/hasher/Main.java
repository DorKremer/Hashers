package hasher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
            SHA256 a = SHA256.getInstance();
            System.out.println(a.hash("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\""));
        }
    }
