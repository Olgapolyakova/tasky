package task2;

/**
 * Created by Olga on 11.12.2016.
 */
public class OperXor {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c;
        c = a^b;
        b = c^b;
        a = c^a;
        System.out.println(a + " " + b);
    }
}
