package task7;

import javafx.beans.binding.StringBinding;

import java.util.Random;

/**
 * Created by Olga on 18.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        String symbols = "qWtyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder sb = new StringBuilder();
        System.out.println(symbols);
        long start, end;
        String result ="";
        start = System.currentTimeMillis();
        prepareBuilder(sb);
        end = System.currentTimeMillis();

        System.out.println(sb.toString());
        System.out.println("Время: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i=0; i<100; i++)
        {  result = result + symbols;}
        end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Время: " + (end - start) + " мс");



    }
    private static void prepareBuilder(StringBuilder sb) {
        for (int i=0; i<100; i++)
        {     sb.append("qWtyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");}

//        .append(sb)
      ;

    }
}
