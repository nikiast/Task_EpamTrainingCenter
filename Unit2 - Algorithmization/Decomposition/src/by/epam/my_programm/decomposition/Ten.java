package by.epam.my_programm.decomposition;

import java.util.Arrays;

public class Ten {

    static int n = 12345;
    static int [] arr = new int [5];

    public static void digitization(){

        for (int i = 0; i < arr.length; i++){
            if(n != 0){
                arr[i] = n % 10;
                n /= 10;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        digitization();
    }
}