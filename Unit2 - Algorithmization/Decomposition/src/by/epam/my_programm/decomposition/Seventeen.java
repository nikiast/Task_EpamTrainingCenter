package by.epam.my_programm.decomposition;

import java.util.Scanner;

public class Seventeen {

    static int number;
    static int numberNumbers;
    static int numberOfDeductions = 0;

    public static void numberInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = scan.nextInt();
    }

    public static void subtractionFrom(){
        int helpNumber = number;

        while (number > 0) {
            int sum = 0;
            while (helpNumber != 0) {
                numberNumbers = helpNumber % 10;
                helpNumber /= 10;
                sum += numberNumbers;
            }
            number -= sum;
            helpNumber = number;
            numberOfDeductions++;
        }
        System.out.println("Кол-во вычитаний : " + numberOfDeductions);
    }

    public static void main(String[] args) {
        numberInput();
        subtractionFrom();
    }
}