package by.epam.my_programm.simple_classes_and_objects;

import java.util.Scanner;

public class BookSort {

    private static Book [] book = new Book [5];
    static Scanner scan = new Scanner(System.in);

    private static void sortAutor(){
        System.out.print("Введите искомого автора: ");
        String desiredAutor = scan.nextLine();

        for (int i = 0; i < book.length; i++){
            if (book[i].getAuthor().equals(desiredAutor)){
                System.out.println(book[i].getName());
            }
        }
    }

    private static void sortPublishingHouse(){
        System.out.print("Введите интересующее вас издательство: ");
        String desiredPublishingHouse = scan.nextLine();

        for (int i = 0; i < book.length; i++){
            if (book[i].getPublishingHouse().equals(desiredPublishingHouse)) {
                System.out.println(book[i].getName());
            }
        }
    }

    private static void sortYearOfPublishing(){
        System.out.print("Введите год: ");
        int desiredYearOfPublishing = scan.nextInt();

        for (int i = 0; i < book.length; i++){
            if (book[i].getYearOfPublishing() > desiredYearOfPublishing){
                System.out.println(book[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        book[0] = new Book("aaa", "aaa", "aaa", 111, 111, 111, "aaa");
        book[1] = new Book("eee", "eee", "bbb", 555, 555, 555, "eee");
        book[2] = new Book("bbb", "bbb", "bbb", 222, 222, 222, "bbb");
        book[3] = new Book("ddd", "ddd", "ddd", 444, 444, 444, "ddd");
        book[4] = new Book("fff", "eee", "bbb", 333, 333, 333, "eee");
        //System.out.println(Arrays.toString(book));

        sortAutor();
        sortPublishingHouse();
        sortYearOfPublishing();
    }
}