package by.epam.my_programm.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Eight {

    static int [] arr = new int [10];

    public static void arrayFilling() {

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sumOfElements(){
        int k = 4;
        int m = 7;
        int sum = 0;

        for (int i = k; i < m; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма элементов от " + k + " до " + m +" равна: " + sum);
    }

    public static void main(String[] args) {
        arrayFilling();
        sumOfElements();
    }
}