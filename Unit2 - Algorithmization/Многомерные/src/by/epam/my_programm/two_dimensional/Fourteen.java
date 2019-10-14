package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Fourteen {

    public static void main(String[] args) {
        Random rand = new Random();
        int m = rand.nextInt(10);
        int n = rand.nextInt(10);

        int[][] arr = new int[m][n];
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr[i].length; j++){
                arr[i][j] = 1;
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
