package task9;

/**
 * Created by Olga on 18.12.2016.
 */
public class Sportsmen implements Comparable {
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
    @Override
    public int compareTo(Object o) {
        Sportsmen tmp = (Sportsmen)o;
        if (this.countGold<tmp.countGold){
            return 1;
        }
        else if (this.countGold>tmp.countGold){
            return -1;
        }
        else return 0;
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
