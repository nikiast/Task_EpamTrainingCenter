package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scan.nextInt();

        int[][] arr = new int [n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = rand.nextInt(10);
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }

        int k = 0;
        for (int i = 0; i < arr.length; i+=2){
            if(arr[0][i] > arr[n-1][i]){
                for (int j = 0; j < arr.length; j++){
                    System.out.print(arr[j][k] + " ");
                }
            }
            System.out.println();
            k+=2;
        }
    }
}
