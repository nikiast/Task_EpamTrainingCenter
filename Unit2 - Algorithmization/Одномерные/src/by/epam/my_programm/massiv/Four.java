package by.epam.my_programm.massiv;

import java.util.Random;

public class Four {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];

        int maxValue = 0;
        int minValue = 40;

        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(40);

            if (array[i] > maxValue){
                maxValue = array[i];
                indexMax = i;

            }else if (array[i] < minValue){
                minValue = array[i];
                indexMin = i;
            }
        }
        array[indexMin] = maxValue;
        array[indexMax] = minValue;
    }
}