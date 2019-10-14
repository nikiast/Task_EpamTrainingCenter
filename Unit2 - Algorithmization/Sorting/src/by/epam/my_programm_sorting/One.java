package by.epam.my_programm_sorting;

import java.util.ArrayList;

public class One {

    public static void main(String[] args) {

        ArrayList <Integer> firstArr = new ArrayList<>();
        ArrayList <Integer> secondArr = new ArrayList<>();
        int k = 2;

        for (int i = 0; i < 3; i++){
            firstArr.add(i, 1);
        }

        for (int i = 0; i < 2; i++){
            secondArr.add(i, 2);
        }

        int n = 0;
        for (int i = 0; i < firstArr.size() + secondArr.size(); i++){
            if(i >= k && i < (k + secondArr.size())){
                firstArr.add(i, secondArr.get(n));
            }
        }
        System.out.println(firstArr);
    }
}