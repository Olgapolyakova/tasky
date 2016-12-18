package task9;

/**
 * Created by Olga on 18.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Sportsmen[] sportsmen = new Sportsmen[4];
        sportsmen[0] = new Sportsmen("ivanov", 4, 10, 0);
        sportsmen[1] = new Sportsmen("petrov", 0, 0, 3);
        sportsmen[2] = new Sportsmen("sidorov", 2, 0 , 1);
        sportsmen[3] = new Sportsmen("semenov", 7, 3, 6);
        sportsmen[4] = new Sportsmen("vasilyw", 4, 5, 1);
        SportsmenUtils sportsmenUtils = new SportsmenUtils();
        sportsmenUtils.sortGold();
    }
}
