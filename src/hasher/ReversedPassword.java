package hasher;

public class ReversedPassword implements IHasher {

    private static ReversedPassword instance;

    private ReversedPassword(){

    }

    public static ReversedPassword getInstance(){
        if(instance==null){
            instance=new ReversedPassword();
        }
        return instance;
    }

    @Override
    public String hash(String password) {
        String res="";
        for (int i = password.length()-1; i >= 0; i--) {
            res=res.concat(String.valueOf(password.charAt(i)));
        }
        return res;
    }
}
