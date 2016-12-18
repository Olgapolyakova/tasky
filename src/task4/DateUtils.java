package task4;

import java.util.Locale;
import java.util.Scanner;


/**
 * Created by Olga on 14.12.2016.
 */
public class DateUtils {

    public static void main(String[] args) {
        Integer number;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число цифрой от 0 до 999");
        number = reader.nextInt();
        String numberWord;
        int a, b, c, d;

        String str[] = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] str10 = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] str11 = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] str100 = {"", "сто", "двести", "тристо", "четыресто", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        a = (number / 10)%10;
        b = number % 10;
        c = number / 100;
        d = number % 100;
           if (10 < d && d < 20) {
                a = number % 10;
                System.out.println(str100[c] + " " +str11[a]);
            }
            else System.out.println(str100[c] + " " + str10[a] + " " + str[b]);
        }
}
