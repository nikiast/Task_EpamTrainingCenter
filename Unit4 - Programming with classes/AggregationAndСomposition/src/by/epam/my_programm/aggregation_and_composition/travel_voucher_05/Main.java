package by.epam.my_programm.aggregation_and_composition.travel_voucher_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<TourPackage> list = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Input name : ");
        String name = scan.nextLine();
        System.out.print("Input surname : ");
        String surname = scan.nextLine();

        Client client = new Client(name, surname);

        System.out.println("Helo " + name + " " + surname);



        System.out.print("Choose type of trip: ");
        for (TourPackageType t : TourPackageType.values()) {
            System.out.println(t);
        }

        String tourType = scan.nextLine();
        TourPackageType tourType1 = TourPackageType.valueOf(tourType.toUpperCase());



        System.out.print("Choose type of transport: ");
        for (Transport t : Transport.values()) {
            System.out.println(t);
        }

        String tranport = scan.nextLine();
        Transport tranport1 = Transport.valueOf(tranport.toUpperCase());



        System.out.print("Choose type of food: ");
        for (TypeOfFood t : TypeOfFood.values()) {
            System.out.println(t);
        }

        String food = scan.nextLine();
        TypeOfFood food1 = TypeOfFood.valueOf(food.toUpperCase());



        System.out.print("Input max number of days: ");
        int maxNumberOfDays = scan.nextInt();

        list.add(new TourPackage(client, "Belarus", "Minsk", tourType1, tranport1, food1, 1, maxNumberOfDays));
        list.add(new TourPackage(client, "Russia", "Moscow", tourType1, tranport1, food1,5, maxNumberOfDays));
        list.add(new TourPackage(client, "Russia", "Sochi", tourType1, tranport1, food1,10, maxNumberOfDays));
        list.add(new TourPackage(client, "Poland", "Warsaw", tourType1, tranport1, food1,3, maxNumberOfDays));
        list.add(new TourPackage(client, "Poland", "Krakow", tourType1, tranport1, food1,2, maxNumberOfDays));
        list.add(new TourPackage(client, "Latvia", "Riga", tourType1, tranport1, food1,2, maxNumberOfDays));

        Collections.sort(list);

        System.out.println(list.toString());
    }
}