package task10;

/**
 * Created by Olga on 25.12.2016.
 */
public class Main {
    public static void main(String[] args) {
    Sportsmen[] sportsmens = new Sportsmen[3];

            sportsmens[0]= new Swimmer(20, 3, 45, "брас");
            sportsmens[1]= new Runner();
            sportsmens[2]= new Freestyler(4);

        for (int i=0; i<sportsmens.length; i++){
            sportsmens[i].start();
        }
    }
}
