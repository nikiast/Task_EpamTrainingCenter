package by.epam.my_programm.aggregation_and_composition.bank_account_04;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static ArrayList<Account> account = new ArrayList<>();

    public static void main(String[] args) {
        Bank bank = new Bank();

        Client Nikita = new Client("Nikita", "Astakhnovich", "111AAA111");
        Client Vadim = new Client("Vadim", "Burak", "111AAA111");

        account.add( new Account(222313549, -400.50, Nikita, true));
        account.add( new Account(555786421, 225.50, Nikita, true));
        account.add( new Account(457454112, -25.35, Vadim, false));
        account.add( new Account(157771254, 1000, Nikita, true));
        account.add( new Account(352154512, 360, Vadim, true));

        Collections.sort(account);
        System.out.println(account);

        bank.Name();

        System.out.println("full sum: " + bank.fullSum(account));
        System.out.println("full positive sum: " + bank.fullPositiveSum(account));
        System.out.println("full negative sum: " + bank.fullNegativeSum(account));
    }
}