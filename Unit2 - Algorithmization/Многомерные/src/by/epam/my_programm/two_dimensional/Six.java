package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Задайте размер матрицы (четное, положительное число): ");
        int sc;
        boolean flag;

        do {
            sc = scan.nextInt();
            if (sc % 2 == 0 && sc > 0) {
                flag = false;
            } else {
                flag = true;
                System.out.print("Задайте размер матрицы (четное, положительное число): ");
            }
        } while (flag);

        int[][] arr = new int[sc][sc];

        for(int i = 0; i < arr.length; i++){
            if(i <= (arr.length - 1) / 2){
                for(int j = i; j < arr[i].length - i; j++){
                    arr[i][j] = 1;
                }
            }else{
                for(int j = arr[i].length - i-1; j < i+1; j++){
                    arr[i][j] = 1;
                }
            }
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
