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
        return password;
    }
}
