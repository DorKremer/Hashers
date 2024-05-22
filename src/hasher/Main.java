package hasher;

public class Main {
    public static void main(String[] args) {
            MD5Hasher a=MD5Hasher.getInstance();
            String b=a.hash("wallak");
            System.out.println(b);
        }
    }
