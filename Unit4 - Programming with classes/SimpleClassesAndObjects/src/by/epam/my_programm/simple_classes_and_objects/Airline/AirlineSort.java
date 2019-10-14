package by.epam.my_programm.simple_classes_and_objects;

import java.util.Scanner;

public class AirlineSort {

    private static Airline [] line = new Airline [10];
    static Scanner scan = new Scanner(System.in);


    static void destinationSort(){

        System.out.print("input destination: ");
        String  dest = scan.nextLine();

        for (Airline line : line) {
            if (dest.equals(line.getDestination())){
                System.out.println(line);
            }
        }
    }

    static void dayOfWeekSort(){

        System.out.print("input day: ");
        String day = scan.nextLine();

        for (Airline line : line) {
            if (day.equals(line.getDayOfWeek())){
                System.out.println(line);
            }
        }
    }

    static void dayAndTimeSort(){

        System.out.print("input day: ");
        String day = scan.nextLine();
        System.out.print("input time: ");
        double time = scan.nextDouble();

        for (Airline line : line) {
            if (day.equals(line.getDayOfWeek()) ){
                if(line.getDepartureTime() > time) {
                    System.out.println(line);
                }
            }
        }
    }


    public static void main(String[] args) {
        line [0] = new Airline ("Minsk", 1, "airplane type 1", 02.11, "Mon");
        line [1] = new Airline ("Minsk", 2, "airplane type 2", 04.23, "Tues");
        line [2] = new Airline ("Moscow", 1, "airplane type 1", 03.40, "Mon");
        line [3] = new Airline ("Moscow", 2, "airplane type 2", 05.25, "Mon");
        line [4] = new Airline ("Moscow", 3, "airplane type 3", 16.21, "Mon");
        line [5] = new Airline ("Moscow", 4, "airplane type 1", 23.00, "Mon");
        line [6] = new Airline ("Paris", 1, "airplane type 1", 05.11, "Mon");
        line [7] = new Airline ("Paris", 2, "airplane type 5", 13.35, "Wed");
        line [8] = new Airline ("Paris", 3, "airplane type 6", 18.19, "Wed");
        line [9] = new Airline ("Paris", 4, "airplane type 5", 00.00, "Thurs");

        destinationSort();
        dayOfWeekSort();
        dayAndTimeSort();
    }
}