package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int[] column = new int [4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }

        System.out.print("Какие столбцы хотим поменять? ");
        int column1 = sc.nextInt();
        int column2 = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            column[i] = arr[i][column1-1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i][column1-1] = arr[i][column2-1];
            arr[i][column2-1] = column[i];
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
