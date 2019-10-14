package by.epam.my_programm.simple_classes_and_objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String bindingType;

    Book(String name, String author, String publishingHouse,
         int yearOfPublishing, int numberOfPages, int price, String bindingType){

        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id += 1;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    String getAuthor(){
        return author;
    }
    void setAuthor(String author){
        this.author = author;
    }

    String getPublishingHouse(){
        return publishingHouse;
    }
    void setPublishingHouse(String publishingHouse){
        this.publishingHouse = publishingHouse;
    }

    int getYearOfPublishing(){
        return yearOfPublishing;
    }
    void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }

    int getNumberOfPages(){
        return numberOfPages;
    }
    void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    int getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price = price;
    }

    String getBindingType(){
        return bindingType;
    }
    void setBindingType(String bindingType){
        this.bindingType = bindingType;
    }

    public String toString(){
        return "\nid: " + getId() + ",\nname: " + getName() +", author: " + getAuthor() + " publishingHouse: " + getPublishingHouse()
                + ",\nyearOfPublishing: " + getYearOfPublishing() + ",\nnumberOfPages: " + getNumberOfPages()
                + ",\nprice: " + getPrice()  + ",\nbindingType: " + getBindingType() + "\n";
    }
}