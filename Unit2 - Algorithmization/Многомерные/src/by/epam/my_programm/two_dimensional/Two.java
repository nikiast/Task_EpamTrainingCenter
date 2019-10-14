package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Two {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int [4][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                arr[i][j] = rand.nextInt(10);
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }

        int n = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i][n]);
            n++;
        }
    }
}
