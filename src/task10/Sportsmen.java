package task10;

/**
 * Created by Olga on 25.12.2016.
 */
public class Sportsmen {
    private int countGold, countSilver, countBronze;

    public Sportsmen() {
    }

    public Sportsmen(int countGold, int countSilver, int countBronze) {
        this.countGold = countGold;
        this.countSilver = countSilver;
        this.countBronze = countBronze;
    }

    public void start(){
        System.out.println("Старт");
    }
}
