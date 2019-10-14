package by.epam.my_programm.simple_classes_and_objects;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int cardNum;
    private int bankNum;
    private int newId = 1;

    Customer(String surname, String name, String patronymic, String address, int cardNum, int bankNum){
        this.id = newId++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNum = cardNum;
        this.bankNum = bankNum;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPatronymic(){
        return patronymic;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getCardNum(){
        return cardNum;
    }
    public void setCardNum(int cardNum){
        this.cardNum = cardNum;
    }

    public int getBankNum() {
        return bankNum;
    }
    public void setBankNum(int bankNum) {
        this.bankNum = bankNum;
    }

    public String toString(){
        return "\nid: " + id + ",\name: " + name +", surname: " + surname + " patronymic: " + patronymic + ",\nadress: " +
                "" + address + ",\ncard number: " + cardNum + ",\nbank account: " + bankNum;
    }
}