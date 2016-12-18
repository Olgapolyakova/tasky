package task8;

/**
 * Created by Olga on 18.12.2016.
 */
public final class SinglTon {
    private static final SinglTon instance = new SinglTon();

    private SinglTon() {
    }

    public  static SinglTon getInstance() {
        return instance;
    }
}
