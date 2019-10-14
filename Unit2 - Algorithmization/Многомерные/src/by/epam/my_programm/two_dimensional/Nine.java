package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Nine {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int[4][4];
        int[] sumColumn =  new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        int n = 0;
        while(n < 4) {
            for (int i = 0; i < 4; i++) {
                sumColumn[n] += arr[i][n];
            }
            n++;
        }

        int sumMax = sumColumn[0];
        int indexColumn = 0;
        for (int i = 0; i < sumColumn.length; i++) {
            if (sumColumn[i] > sumMax){
                sumMax = sumColumn[i];
                indexColumn = i + 1;
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }
        for (int i : sumColumn) {
            System.out.print(i+" ");
        }

        System.out.println("\nВ столбце " + indexColumn  + " наибольшая сумма элементов = " + sumMax);
    }
}