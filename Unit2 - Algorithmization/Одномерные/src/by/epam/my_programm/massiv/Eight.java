package by.epam.my_programm.massiv;

import java.util.Random;

public class Eight {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] array1 = new int[10];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(10);
        }

        int minValue = array1[0];

        for(int i = 0; i < array1.length; i++){
            if(array1[i] < minValue){
                minValue = array1[i];
            }
        }

        for (int i = 0; i < array1.length; i++){
            if(array1[i] == minValue){
                count++;
            }
        }

        int[] array2 = new int[10-count];
        int j = 0;

        for(int i = 0; i < array1.length; i++){
            if (array1[i] != minValue){
                array2[j] = array1[i];
                j++;
            }
        }
    }
}
