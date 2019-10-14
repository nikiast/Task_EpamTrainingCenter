package by.epam.my_programm.aggregation_and_composition.bank_account_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static Scanner scan = new Scanner(System.in);
    static String ClientName;

    Bank(){}

    public void Name() {
        System.out.print("input name: ");
        String name = scan.nextLine();
        ClientName = name;
    }

    public double fullSum(ArrayList<Account> account){
        double sum = 0;


        for (Account ac: account) {
            if(ac.getClient().getName().equals(ClientName)) {
                sum += ac.getBalance();
            }
        }
        return sum;
    }

    public double fullNegativeSum(ArrayList<Account> account){
        double sum = 0;

        for (Account ac: account) {
            if(ac.getClient().getName().equals(ClientName)) {
                if (ac.getBalance() < 0) {
                    sum += ac.getBalance();
                }
            }
        }
        return sum;
    }

    public double fullPositiveSum(ArrayList<Account> account){
        double sum = 0;

        for (Account ac: account) {
            if(ac.getClient().getName().equals(ClientName)) {
                if (ac.getBalance() > 0) {
                    sum += ac.getBalance();
                }
            }
        }
        return sum;
    }
}