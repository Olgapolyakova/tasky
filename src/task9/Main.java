package task9;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Olga on 18.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int all[] = new int[4];
        Sportsmen[] sportsmen = new Sportsmen[4];
        Sportsmen sportsmen0 = new Sportsmen("sportsmen_1", 4, 10, 0);
        Sportsmen sportsmen1 = new Sportsmen( "sportsmen_2", 8, 0, 3);
        Sportsmen sportsmen2 = new Sportsmen("sportsmen_3", 2, 0 , 1);
        Sportsmen sportsmen3 = new Sportsmen( "sportsmen_4",7, 3, 6);
        sportsmen[0] = sportsmen0;
        sportsmen[1] = sportsmen1;
        sportsmen[2] = sportsmen2;
        sportsmen[3] = sportsmen3;
        Arrays.sort(sportsmen);
        System.out.println("Спортсмены отсортированные по золотым наградам");
        for (int i=0; i<sportsmen.length; i++){
               System.out.println(sportsmen[i].getNameSportsmen() + " " +
               sportsmen[i].getCountGold()+" " + sportsmen[i].getCountSilver() + " " + sportsmen[i].getCountBronze());
            }
        for (int i=0; i<all.length; i++){
            all[i]=sportsmen[i].getCountBronze()+ sportsmen[i].getCountSilver() +  sportsmen[i].getCountBronze();

        }


//        sportsmenUtils.sortGold[];
    }
}
