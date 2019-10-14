package by.epam.my_programm_sorting;

import java.util.Arrays;

public class Two {

    public static void main(String[] args){

        int [] arr1 = {1, 2, 4, 5, 6, 8, 9, 11, 14, 16};
        int [] arr2 = {0, 5, 6, 8, 10, 12, 132};
        int [] resultArray = new int [(arr1.length + arr2.length)];


        int a = 0;
        int b = 0;
        int c = 0;

        do{
            if(a < arr1.length && b < arr2.length) {
                if (arr1[a] <= arr2[b]) {
                    resultArray[c] = arr1[a];
                    c++;
                    a++;
                } else {
                    resultArray[c] = arr2[b];
                    c++;
                    b++;
                }
            }else if(a < arr1.length){
                resultArray[c] = arr1[a];
                c++;
                a++;
            }else{
                resultArray[c] = arr2[b];
                c++;
                b++;
            }
        }while(c < resultArray.length );

        System.out.println(Arrays.toString(resultArray));
    }
}