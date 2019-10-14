package by.epam.my_programm.aggregation_and_composition.bank_account_04;

public class Client {
    private String name;
    private String surname;
    private String numberId;

    Client(String name, String surname, String numberId){
        this.name = name;
        this.surname = surname;
        this.numberId = numberId;
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

    public String getNumberId() {
        return numberId;
    }
    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }



    public String toString(){
        return "\n Name: " + name + "; surname: " + surname + "; numberId: " + numberId;
    }
}