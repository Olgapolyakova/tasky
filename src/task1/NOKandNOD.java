package task1;

import java.util.Scanner;

/**
 * Created by Olga on 11.12.2016.
 */
public class NOKandNOD {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        System.out.println("НОД 2х чисел: " + NOD(number1,number2));
        System.out.println("НОК 2х чисел: " + NOK(number1,number2));
    }
    public static int NOD(int number1, int number2) {
        if (number2 == 0) return number1;
         else  return (NOD(number2, number1%number2));
    }
    public static int NOK(int number1, int number2){
        return (number1*number2)/NOD(number1,number2);
    }
}
