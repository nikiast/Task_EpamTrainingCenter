package by.epam.my_programm_sorting;

import java.util.Arrays;

public class Six {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6 ,3, 76, 4};

        for(int i = 0; i < arr.length - 1; i++) {
            int change;

            if (arr[i] > arr[i + 1]) {
                change = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = change;
                if (i > 0) {
                    i -= 2;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}