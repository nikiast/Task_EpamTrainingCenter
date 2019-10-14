package by.epam.my_programm.aggregation_and_composition.travel_voucher_05;

public class Client {
    private String name;
    private String surname;

    Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(){
        return "\n Name: " + name + "; surname: " + surname;
    }
}