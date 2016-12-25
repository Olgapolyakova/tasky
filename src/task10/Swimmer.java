package task10;

/**
 * Created by Olga on 25.12.2016.
 */
public class Swimmer extends Sportsmen {
    private String distance;

    public Swimmer(int countGold, int countSilver, int countBronze, String distance) {
        super(countGold, countSilver, countBronze);
        this.distance = distance;
    }

    @Override
    public void  start() {
        System.out.println("Пловец стартовал");
    }
}
