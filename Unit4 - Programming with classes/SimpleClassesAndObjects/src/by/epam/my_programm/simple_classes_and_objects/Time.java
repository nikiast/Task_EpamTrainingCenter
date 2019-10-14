package by.epam.my_programm.simple_classes_and_objects;

import java.util.Scanner;

public class Time {
    static Scanner scan = new Scanner(System.in);
    private int hour;
    private int minutes;
    private int seconds;

    private Time (int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHour(){
        return hour;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }


    public void setHour(int hour){
        if(hour > 24 || hour < 0){
            this.hour = 0;
        }else {
            this.hour = hour;
        }
    }
    public void setMinutes(int minutes){
        if(minutes > 60 || minutes < 0){
            this.minutes = 0;
        }else {
            this.minutes = minutes;
        }
    }
    public void setSeconds(int seconds){
        if(seconds > 60 || seconds < 0){
            this.seconds = 0;
        }else {
            this.seconds = seconds;
        }
    }


    public static void main(String[] args) {
        Time time = new Time(12,33,15);
        System.out.println("Время: " + time.getHour() + " ч " + time.getMinutes() + " мин " + time.getSeconds() + " сек");

        System.out.println("Хотите изменить время?\n" +
                "1 - да; 2 - нет");

        int num = scan.nextInt();
        if(num == 1) {

            System.out.println("Если хотите ввести часы - нажмите 1\n" +
                    "Если хотите ввести минуты - нажмите 2\n" +
                    "Если хотите ввести секунды - нажмите 3\n" +
                    "Для выхода из программы - нажмите 5.");

            boolean flag = false;
            while (!flag) {

                System.out.print("\nВведите номер: ");
                num = scan.nextInt();
                int check = 0;

                switch (num) {

                    case 1:
                        System.out.print("Введите время в часах: ");
                        check = scan.nextInt();
                        time.setHour(check);
                        System.out.println("Новое время: " + time.getHour() + " ч " + time.getMinutes() + " мин " + time.getSeconds() + " сек");
                        break;

                    case 2:
                        System.out.print("Введите время в минутах: ");
                        check = scan.nextInt();
                        time.setMinutes(check);
                        System.out.println("Новое время: " + time.getHour() + " ч " + time.getMinutes() + " мин " + time.getSeconds() + " сек");
                        break;

                    case 3:
                        System.out.print("Введите время в секундах: ");
                        check = scan.nextInt();
                        time.setSeconds(check);
                        System.out.println("Новое время: " + time.getHour() + " ч " + time.getMinutes() + " мин " + time.getSeconds() + " сек");
                        break;

                    case 5:
                        System.out.println("Выход из программы");
                        flag = true;
                        break;

                    default:
                        System.out.println("Вы ввели неверное число");
                        break;
                }
            }
        }
    }
}