package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Fifteen {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int[5][5];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(15);
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] % 2 != 0){
                    arr[i][j] = max;
                }
            }
        }

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
