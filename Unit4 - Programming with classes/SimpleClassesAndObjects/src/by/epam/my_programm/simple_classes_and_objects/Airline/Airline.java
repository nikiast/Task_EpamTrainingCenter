package by.epam.my_programm.simple_classes_and_objects;

public class Airline {
    private String destination;
    private int flightNumber;
    private String typeOfAirplane;
    private double departureTime;
    private String dayOfWeek;

    Airline (String destination, int flightNumber, String typeOfAirplane, double departureTime, String dayOfWeek){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAirplane = typeOfAirplane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    String getDestination(){
        return destination;
    }
    void setDestination(String destination){
        this.destination = destination;
    }

    int getFlightNumber(){
        return flightNumber;
    }
    void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }

    String getTypeOfAirplane(){
        return typeOfAirplane;
    }
    void setTypeOfAirplane(String typeOfAirplane){
        this.typeOfAirplane = typeOfAirplane;
    }

    double getDepartureTime(){
        return departureTime;
    }
    void setDepartureTime(double departureTime){
        this.departureTime = departureTime;
    }

    String getDayOfWeek(){
        return dayOfWeek;
    }
    void setDayOfWeek(String dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    public String toString(){
        return ",\nDestination: " + getDestination() +"; Flight Number: " + getFlightNumber() + "; Type Of Airplane: " + getTypeOfAirplane()
                + ";\nDeparture Time: " + getDepartureTime() + ";\nDay Of Week: " + getDayOfWeek() + "\n";
    }
}
