package by.epam.my_programm.simple_classes_and_objects;

import java.util.Scanner;

public class Train{
    String punktNazn;
    int numTrain;
    double time;
    static Scanner scan = new Scanner(System.in);

    public Train(String punktNazn, int numTrain, double time){
        this.punktNazn = punktNazn;
        this.numTrain = numTrain;
        this.time = time;
    }

    static Train[] trains = {
            new Train("Molo", 4, 18.12),
            new Train("Minsk", 3, 08.36),
            new Train("Polotsk", 5, 14.48),
            new Train("Brest", 1, 02.55),
            new Train("Molo", 2, 11.03),
            new Train("Minsk", 6, 13.09),
            new Train("Molo", 7, 4.52),
            new Train("Minsk", 8, 7.32)
    };

    public static void TrainsSortNum (){

        boolean isSorted = false;
        Train buf;

        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length-1; i++) {
                if(trains[i].numTrain > trains[i+1].numTrain){
                    isSorted = false;
                    buf = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = buf;
                }
            }
        }

        for (int i = 0; i < trains.length; i++) {
            System.out.print(trains[i].punktNazn + " " + trains[i].numTrain + " " + trains[i].time);
            System.out.println();
        }
    }

    public static void InfoNumTrain(){

        System.out.print("Введите номер поезда: ");
        int trainScan = scan.nextInt();

        for (int i = 0; i < trains.length; i++){
            if(trains[i].numTrain == trainScan){
                System.out.print(trains[i].punktNazn + " " + trains[i].numTrain + " " + trains[i].time);
                break;
            }
        }
    }

    public static void TrainsSortPunktNazn (){
        Scanner scanPunkt = new Scanner(System.in);

        System.out.print("Введите город: ");
        String scanPunktNazn = scanPunkt.nextLine();

        Train buf;
        boolean flag;
        int num = 0;

        for (int i = 0; i < trains.length; i++){

            flag = scanPunktNazn.equals(trains[i].punktNazn);

            if(flag){
                buf = trains[num];
                trains[num] = trains[i];
                trains[i] = buf;
                num++;
            }
        }

        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length; j++){

                if(i == j){
                    continue;
                }
                flag = trains[i].punktNazn.equals(trains[j].punktNazn);
                if (flag){
                    if (trains[i].time < trains[j].time){
                        buf = trains[j];
                        trains[j] = trains[i];
                        trains[i] = buf;
                    }
                }
            }
        }

        for (int i = 0; i < trains.length; i++) {
            System.out.print(trains[i].punktNazn + " " + trains[i].numTrain + " " + trains[i].time);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        for(int i = 0; i < trains.length; i++){
            System.out.println(trains[i].punktNazn + " " + trains[i].numTrain + " " + trains[i].time);
        }
        System.out.println();
        System.out.println("Если вы хотите отсортировать по номерам поезда - нажмите 1.\n" +
                "Если вы хотите увидеть информацию о конкретном поезде - нажмите 2.\n" +
                "Если вы хотите отсортировать поезда по пункту назначения - нажмите 3.\n" +
                "Для выхода из программы - нажмите 5.");

        boolean flag = false;
        while (!flag){

            System.out.print("\nВведите номер: ");
            int num = scan.nextInt();

            switch (num){

                case 1:
                    TrainsSortNum();
                    break;

                case 2 :
                    InfoNumTrain();
                    break;

                case 3:
                    TrainsSortPunktNazn ();
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