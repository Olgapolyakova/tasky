package task9;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Comp  implements Comparable{
    String str;
    int count;
    Comp(int count, String str){
        this.count = count;
        this.str = str;
    }
    @Override
    public int compareTo(Object o){
        Comp comp = (Comp) o;
        int result = str.compareTo(comp.str);
        if(result != 0) {
            return result;
        }

        result = count - comp.count;
        if(result != 0) {
            return (int) result / Math.abs( result );
        }
        return 0;
    }


}
