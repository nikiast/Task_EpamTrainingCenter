package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Eleven {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] arr = new int[10][15];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(15);
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }

        int [] arr2 = new int [10];

        for (int i = 0; i < arr.length; i++) {
            int qty5 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 5){
                    qty5++;
                }
            }
            arr2[i] = qty5;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr2[i] >= 3){
                System.out.println("Номер строки, в которой число 5 встречается 3 и более раз: " + (i + 1));
            }
        }
    }
}
