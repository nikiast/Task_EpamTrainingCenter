package by.epam.my_programm_sorting;

import java.util.Arrays;

public class Three {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 8, 9, 11, 14, 16};
        int indexMaxNum = 0;
        boolean flag = false;
        int buf;

        while (!flag) {

            for (int i = 0; i < arr.length; i++) {
                int maxNum = 0;

                for (int j = i; j < arr.length; j++) {

                    if (arr[j] > maxNum) {
                        maxNum = arr[j];
                        indexMaxNum = j;
                        flag = true;
                    }
                }
                buf = arr[i];
                arr[i] = maxNum;
                arr[indexMaxNum] = buf;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}