package by.epam.my_programm_sorting;

import java.util.Random;

public class Eight {

    public static void main(String[] args) {
        Random rand = new Random();

        int [] numerator = new int[5];
        int [] denominator = new int[5];

        for(int i = 0; i < numerator.length; i++) {
            numerator[i] = rand.nextInt(10);
            denominator[i] = rand.nextInt(15);
        }

        for(int i = 0; i < numerator.length; i++) {
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numerator.length; i++){
            for (int j = 0; j < denominator.length; j++){
                if(i != j){
                    numerator[i] *= denominator[j];
                }
            }
        }

        int generalDenominator = 1;
        for(int j = 0; j < denominator.length; j++){
            generalDenominator *= denominator[j];
        }

        for (int i = 0; i < denominator.length; i++){
            denominator[i] = generalDenominator;
        }

        for(int i = 0; i < numerator.length - 1; i++){
            int change;
            if(i > 0){
                if(numerator[i] > numerator[i + 1]){
                    change = numerator[i];
                    numerator[i] = numerator[i + 1];
                    numerator[i + 1] = change;
                    i -= 2;
                }
            }else{
                if(numerator[i] > numerator[i + 1]) {
                    change = numerator[i];
                    numerator[i] = numerator[i + 1];
                    numerator[i + 1] = change;
                }
            }
        }

        for(int i = 0; i < numerator.length; i++) {
            System.out.println(numerator[i] + "/" + denominator[i]);
        }
    }
}