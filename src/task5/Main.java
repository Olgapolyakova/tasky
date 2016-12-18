package task5;

import java.util.Scanner;

/**
 * Created by Olga on 16.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);
        number = reader.nextInt();
        int array[][]=new int[number][number];

        for (int i=0;i<number/2+1;i++){
            for (int j=0;j<number;j++){
                if ((j<i) || (j>=(number-i)))
                    array[i][j]=0;
                else
                    array[i][j]=1;
            }
        }
        for (int i=number-1; i>=number/2; i--){
            for (int j=0; j<array[i].length; j++){
                if ((j<(number-1-i)) || (j>i))
                    array[i][j]=0;
                else
                    array[i][j]=1;}
        }
        for (int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    }



