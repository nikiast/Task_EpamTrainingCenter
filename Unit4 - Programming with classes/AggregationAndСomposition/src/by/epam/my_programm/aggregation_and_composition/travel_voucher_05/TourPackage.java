package by.epam.my_programm.aggregation_and_composition.travel_voucher_05;

public class TourPackage implements Comparable<TourPackage>{
    private Client client;
    private String country;
    private String city;
    private TourPackageType type;
    private Transport transport;
    private TypeOfFood food;
    private int numberOfDays;
    private int maxNumberOfDays;

    TourPackage(Client client, String country, String city, TourPackageType type,
                Transport transport, TypeOfFood food, int numberOfDays, int maxNumberOfDays) {
        this.client = client;
        this.country = country;
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.maxNumberOfDays = maxNumberOfDays;
    }

    @Override
    public int compareTo(TourPackage o) {
        return this.getMaxNumberOfDays() - o.getNumberOfDays();
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public TourPackageType getType() {
        return type;
    }
    public void setType(TourPackageType type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TypeOfFood getFood() {
        return food;
    }
    public void setFood(TypeOfFood food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getMaxNumberOfDays() {
        return maxNumberOfDays;
    }
    public void setMaxNumberOfDays(int maxNumberOfDays) {
        this.maxNumberOfDays = maxNumberOfDays;
    }

    @Override
    public String toString() {
        return client + "; \nCountry: " + country + ";  City: " + city + "; Tour Package Type: " + type + "; Transport: " + transport +
                 "; Type Of Food: " + food + "; number Of Days: " + numberOfDays;
    }
}