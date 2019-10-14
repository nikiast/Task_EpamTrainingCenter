package by.epam.my_programm.decomposition;

import java.util.ArrayList;
import java.util.Random;

public class Twelve {

    static int k = 50;
    static int n = 10;
    static ArrayList <Integer> arr = new ArrayList<>();

    public static void arrayFilling(){
        Random rand = new Random();

        int sum = 0;
        int i = 0;

        while (sum < k - n){
            arr.add(rand.nextInt(n));
            sum += arr.get(i);
            i++;
        }

        arr.add(k - sum);

        System.out.println(arr);
    }

    public static void main(String[] args) {
        arrayFilling();
    }
}