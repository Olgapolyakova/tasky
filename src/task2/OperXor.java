package task2;

/**
 * Created by Olga on 11.12.2016.
 */
public class OperXor {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}
