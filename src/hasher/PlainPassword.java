package hasher;

public class PlainPassword implements IHasher{

    private static PlainPassword instance;

    private PlainPassword(){

    }

    public static PlainPassword getInstance(){
        if(instance==null){
            instance=new PlainPassword();
        }
        return instance;
    }

    @Override
    public String hash(String password) {
        return password;
    }
}
