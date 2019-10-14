import java.util.Scanner;
import java.util.ArrayList;


public class Сycles {
    public static void main(String[] args) {

        //  Циклы
        //  1. Напишите программу, где пользователь вводит любое целое положительное число.
        //  А программа суммирует все числа от 1 до введенного пользователем числа.
        //  2. Вычислить значения функции на отрезке [а,b] c шагом h:
        //  3. Найти сумму квадратов первых ста чисел.
        //  4. Составить программу нахождения произведения квадратов первых двухсот чисел.
        //  5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
        //  заданному е. Общий член ряда имеет вид
        //  6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
        //  7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        //  m и n вводятся с клавиатуры.
        //  8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {

            System.out.println("Для выхода введите 10");
            System.out.print("Введите номер задачи (от 1 до 8): ");
            int taskNumber = scan.nextInt();

            switch (taskNumber) {

                case 1:

                    //  1. Напишите программу, где пользователь вводит любое целое положительное число.
                    //  А программа суммирует все числа от 1 до введенного пользователем числа.

                    System.out.println("Введите число: ");
                    int n = input.nextInt();
                    int summ = 0;

                    if (n > 0) {
                        for (int i = 0; i <= n; i++) {
                            summ += i;
                        }
                        System.out.println(summ);
                    }else{
                        System.out.println("Неверное число!");
                    }
                    break;

                case 2:

                    //  2. Вычислить значения функции на отрезке [а,b] c шагом h

                    System.out.println("Введите значение а :");
                    double a = input.nextDouble();

                    System.out.println("Введите значение b :");
                    double b = input.nextDouble();

                    System.out.println("Введите значение h :");
                    double h = input.nextDouble();

                    double f;
                    double x = a;

                    if (x <= 2) {

                        for (double i = a; i <= b; i +=  h) {
                            f = -i;
                            System.out.println("F = " + f);
                        }
                    }else if (x > 2) {
                        for (double i = a; i <= b; i = i + h) {
                            f = i;
                            System.out.println("F = " + f);
                        }
                    }
                    break;

                case 3:

                    //  3. Найти сумму квадратов первых ста чисел.

                    int sum = 0;
                    for (int i = 0; i <= 100; i++) {
                        sum += Math.pow(i, 2);
                    }
                    System.out.println("Результат: " + sum);
                    break;

                case 4 :

                    //  4. Составить программу нахождения произведения квадратов первых двухсот чисел.

                    long mult = 1;
                    for (int i = 1; i <= 200; i++) {
                        mult *= Math.pow(i, 2);
                    }
                    System.out.println("Результат: " + mult);
                    break;

                case 5 :

                    //  5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
                    //  заданному е. Общий член ряда имеет вид

                   break;

                case 6 :

                    //  6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

                    System.out.println("Введите символ");
                    char c = input.next().charAt(0);
                    int code = (int) c;
                    System.out.println("Symbol[" + c + "]=" + code);
                    break;

                case 7 :

                    //  7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
                    //  m и n вводятся с клавиатуры.

                    System.out.println("Введите число m: ");
                    int m = input.nextInt();

                    System.out.println("Введите число n:");
                    n = input.nextInt();

                    for (int i = m; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0 && j != 1 && j != i) {
                                System.out.println("Делитель числа " + i + " = " + j);
                            }
                        }
                    }
                    break;

                case 8 :

                    //  8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

                    System.out.println("Введите число а: ");
                    int p = input.nextInt();

                    System.out.println("Введите число b: ");
                    int o = input.nextInt();

                    char [] ch1 = String.valueOf(p).toCharArray();
                    char [] ch2 = String.valueOf(o).toCharArray();

                    for (int i = 0; i < ch1.length; i++){
                        for (int j = 0; j < ch2.length; j++){
                            if(ch1[i] == ch2[j]){
                                System.out.println("Цифра " + ch1[i] + " есть в обоих числах");
                            }
                        }
                    }
                    break;

                case 10:

                    flag = true;
                    break;

                default:

                    System.out.println("Неверное число");
            }
        }
    }
}
