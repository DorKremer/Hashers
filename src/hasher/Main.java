package hasher;

public class Main {
    public static void main(String[] args) {
            SHA256 a=SHA256.getInstance();
            System.out.println("aak*a  -->  "+a.hash("aak*a"));
        }
    }
