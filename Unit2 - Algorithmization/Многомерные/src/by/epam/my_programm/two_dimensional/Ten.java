package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Ten {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int [4][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = - 5 + rand.nextInt(10);
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }

        int n = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i][n] > 0) {
                System.out.println("Положительный(е) элементы главной диагонали: " + arr[i][n]);
                k++;
            }
            n++;
        }
        if(k == 0) {
            System.out.println("В главной диагонали нету положительных элементов ");
        }
    }
}
