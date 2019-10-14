package by.epam.my_programm.massiv;

import java.util.Random;

public class Five {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] > i){
                System.out.print(array[i] + " ");
            }
        }
    }
}
