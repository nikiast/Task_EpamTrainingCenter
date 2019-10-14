package by.epam.my_programm.two_dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Задайте размер матрицы (четное, положительное число): ");
        int sc;
        boolean flag;

        do{
            sc = scan.nextInt();
            if(sc % 2 == 0 && sc > 0) {
                flag = false;
            }else{
                flag = true;
                System.out.print("Задайте размер матрицы (четное, положительное число): ");
            }
        }while(flag);

        int[][] arr = new int [sc][sc];
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
            }
            num++;
            sc--;
        }

        for (int [] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
