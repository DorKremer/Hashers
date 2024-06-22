package com.hit.algorithm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HashersTest {

    @Test
    public void plainPasswordTest1(){
        PlainPassword pp=PlainPassword.getInstance();
        String hash=pp.hash("abcde");
        assertEquals("abcde", hash);
    }

    @Test
    public void plainPasswordTest2(){
        PlainPassword pp=PlainPassword.getInstance();
        String hash=pp.hash("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\"");
        assertEquals("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\"", hash);
    }

    @Test
    public void reversedPasswordTest1(){
        ReversedPassword pp=ReversedPassword.getInstance();
        String hash=pp.hash("abcde");
        assertEquals("edcba", hash);
    }

    @Test
    public void reversedPasswordTest2(){
        ReversedPassword pp=ReversedPassword.getInstance();
        String hash=pp.hash("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\"");
        assertEquals("\",./';~`}{][\\|?></+=_-)(*&^%$#@!0", hash);
    }

    @Test
    public void zztopTest1(){
        ZZTop pp=ZZTop.getInstance();
        String hash=pp.hash("abcde");
        assertEquals("zyxwv", hash);
    }

    @Test
    public void zztopTest2(){
        ZZTop pp=ZZTop.getInstance();
        String hash=pp.hash("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\"");
        assertEquals("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\"", hash);
    }

    @Test
    public void shaTest1(){
        SHA256 pp=SHA256.getInstance();
        String hash=pp.hash("abcde");
        assertEquals("D716EC61E18904A8F58679B71CB065D4D5DB72E0E0C3F155A4FEFF7ADD0E58EB", hash);
    }

    @Test
    public void shaTest2(){
        SHA256 pp=SHA256.getInstance();
        String hash=pp.hash("0!@#$%^&*()-_=+/<>?|\\[]{}`~;'/.,\"");
        assertEquals("2AF10D88204DE13C618A413D858C1A21CA760095E648C622FD3D018D720A8223", hash);
    }
}
