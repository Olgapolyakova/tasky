package task23;

import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(954);
        list.add(200);
        list.add(302);
        list.add(34);
        list.add(3094);

        logger.info("Инфо, Логгирование");
        for (Integer i: list){
            list.remove((Integer)3);
       }
        for (Integer i: list){
            System.out.println(i);
        }

    }
}
