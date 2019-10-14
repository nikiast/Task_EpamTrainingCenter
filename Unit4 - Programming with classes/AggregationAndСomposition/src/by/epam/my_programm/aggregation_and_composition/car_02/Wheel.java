package by.epam.my_programm.aggregation_and_composition.car_02;

public class Wheel {
    private int diameter;
    private String typeOfRubber;

    Wheel(int wheel,String typeOfRubber){
        this.diameter = wheel;
        this.typeOfRubber = typeOfRubber;
    }

    public int getDiameter() {
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }
    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }
}
