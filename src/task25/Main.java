package task25;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Main {
    public static void main(String[] args) {

            try {
                Integer num = null;
                int num1 = 21 / num;

                }
            catch (NullPointerException e){
                System.out.println(e);
            }

            catch (OutOfMemoryError e){
                System.out.println(e);
            }
    }
}
