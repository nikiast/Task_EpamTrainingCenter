package by.epam.my_programm.aggregation_and_composition.bank_account_04;

public class Account implements Comparable<Account>{
    private int numberOfAccount;
    private boolean bloc;
    private double balance;
    private Client client;

    Account(int numberOfAccount, double balance, Client client, boolean bloc){
        this.numberOfAccount = numberOfAccount;
        this.balance = balance;
        this.client = client;
        this.bloc = bloc;
    }

    @Override
    public int compareTo(Account o) {
        return this.getNumberOfAccount() - o.getNumberOfAccount();
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }
    public void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public String getBloc(){
        if(bloc){
            return "Account Unblocked";
        }else{
            return "Account Blocked";
        }
    }
    public void setBlocUnloc(boolean bloc) {
        this.bloc = true;
    }
    public void setBloc(boolean bloc) {
        this.bloc = false;
    }

    public String toString(){
        return client + "\nAccount number: " + numberOfAccount + "; balance: " + balance + "; account status: " + getBloc();
    }
}