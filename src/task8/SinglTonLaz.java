package task8;

/**
 * Created by Olga on 24.12.2016.
 */
public class SinglTonLaz {
    private static SinglTonLaz instance;
    private SinglTonLaz(){};

    public static SinglTonLaz getInstance(){
        if (instance==null){
            instance = new SinglTonLaz();
        }
        return instance;
    }


}
