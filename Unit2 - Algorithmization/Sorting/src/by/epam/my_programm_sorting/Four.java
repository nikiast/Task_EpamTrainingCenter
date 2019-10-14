package by.epam.my_programm_sorting;

import java.util.Arrays;

public class Four {

    public static void main(String[] args) {

        int[] arr = {16, 15, 13, 11, 10, 8, 5, 3, 1, 0};
        boolean flag = false;
        int buf;
        int numberOfPermutations = 0;

        while(!flag) {
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]){
                    flag = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                    numberOfPermutations++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(numberOfPermutations);
    }
}