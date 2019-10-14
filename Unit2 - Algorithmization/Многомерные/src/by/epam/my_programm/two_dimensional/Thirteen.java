package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Thirteen {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(15);
            }
        }

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println();

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                for(int j = 0; j < arr.length-1; j++) {
                    if (arr[i+1][j] < arr[i][j]) {      // сортировка столбцов по убыванию
                        isSorted = false;
                        buf = arr[i][j];
                        arr[i][j] = arr[i+1][j];
                        arr[i+1][j] = buf;
                    }
                }
            }
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println();

        isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                for(int j = 0; j < arr.length-1; j++) {
                    if (arr[i+1][j] > arr[i][j]) {      // сортировка столбцов по возрастанию
                        isSorted = false;
                        buf = arr[i][j];
                        arr[i][j] = arr[i+1][j];
                        arr[i+1][j] = buf;
                    }
                }
            }
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
