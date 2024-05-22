package hasher;

//Written as singleton because it made sense to me, probably not that important,
//you're more than welcome to change it if you want.

//The MD5 is just an example, doesn't mean we will actually use it, it's basically a placeholder name for now.

//Wasn't sure if we want to implement the hash ourselves or use an existing class that will do it for us,
//so the "hash()" implementation isn't really an implementation.

public class MD5Hasher implements IHasher{

    private static MD5Hasher instance;

    private MD5Hasher(){

    }

    public static MD5Hasher getInstance(){
        if(instance==null){
            instance=new MD5Hasher();
        }
        return instance;
    }

    @Override
    public String hash(String text) {
        return "MD5";
    }
}
