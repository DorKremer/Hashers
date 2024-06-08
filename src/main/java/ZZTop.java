package main.java;

public class ZZTop implements IHasher {
    private static ZZTop instance;

    private ZZTop(){

    }

    public static ZZTop getInstance(){
        if(instance==null){
            instance=new ZZTop();
        }
        return instance;
    }


    @Override
    public String hash(String password) {
        final int BASIS ='a'+'z';
        String res="";
        char tmp;
        password=password.toLowerCase();
        for (int i = 0; i < password.length(); i++) {
            tmp=password.charAt(i);
            if(tmp<='z'&&tmp>='a')
                res=res.concat(String.valueOf((char)(BASIS-tmp)));
            else
                res=res.concat(String.valueOf(tmp));
        }
        return res;
    }
}
