package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Three {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }

        int k = 0;
        System.out.print("Строка с индексом " + k + ": ");
        for (int i = 0; i < arr.length; i++) { //вывод k-той строки
            System.out.print(arr[k][i]);
        }

        System.out.println();

        int p = 2;
        System.out.print("Столбец c номером " + p + ": ");
        for (int i = 0; i < arr.length; i++) { //вывод p-того столбца
            System.out.print(arr[i][p]);
        }
    }
}