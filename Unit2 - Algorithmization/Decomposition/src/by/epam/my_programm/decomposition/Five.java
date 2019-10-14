package by.epam.my_programm.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Five {

    static int[] arr = new int[6];
    static int maxNum = 0;
    static int miniMaxNum = 0;

    public static void arrayFilling() {

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void findingNumber() {

        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                miniMaxNum = maxNum;
                maxNum = arr[i];
            }else if(miniMaxNum < arr[i] && arr[i] != maxNum)
                miniMaxNum = arr[i];
        }
        System.out.println("Второе по величине число: " + miniMaxNum);
    }

    public static void main(String[] args) {
        arrayFilling();
        findingNumber();
    }
}