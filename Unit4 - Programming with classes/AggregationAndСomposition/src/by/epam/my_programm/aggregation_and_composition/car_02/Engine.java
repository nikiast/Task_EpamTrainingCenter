package by.epam.my_programm.aggregation_and_composition.car_02;

public class Engine {

    private int power;
    private int numberOfCylinders;

    Engine(int power,int numberOfCylinders){
        this.power = power;
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}
