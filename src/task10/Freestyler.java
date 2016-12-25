package task10;

import task9.*;

/**
 * Created by Olga on 25.12.2016.
 */
public class Freestyler extends Sportsmen {
    private int countPerf;

    public Freestyler(int countPerf) {
        this.countPerf = countPerf;
    }

    @Override
    public  void start() {
        System.out.println("Фристайлист стартует");
    }
}
