package task9;

/**
 * Created by Olga on 18.12.2016.
 */
public class Sportsmen {
        private String nameSportsmen;
        private int countGold;
        private int countSilver;
        private int countBronze;
     //   private int All = countGold + countSilver + countBronze;

        public Sportsmen() {
        }

    public Sportsmen(String nameSportsmen, int countGold, int countSilver, int countBronze) {
        this.nameSportsmen = nameSportsmen;
        this.countGold = countGold;
        this.countSilver = countSilver;
        this.countBronze = countBronze;
    }


    public String getNameSportsmen() {
        return nameSportsmen;
    }

    public void setNameSportsmen(String nameSportsmen) {
        this.nameSportsmen = nameSportsmen;
    }

    public int getCountGold() {
        return countGold;
    }

    public void setCountGold(int countGold) {
        this.countGold = countGold;
    }

    public int getCountSilver() {
        return countSilver;
    }

    public void setCountSilver(int countSilver) {
        this.countSilver = countSilver;
    }

    public int getCountBronze() {
        return countBronze;
    }

    public void setCountBronze(int countBronze) {
        this.countBronze = countBronze;
    }
}
