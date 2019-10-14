package by.epam.my_programm.aggregation_and_composition.car_02;

public class Car {
    private String mark;
    private String color;
    private int serialNumber;

    Car(String mark, String color, int serialNumber){
        this.mark = mark;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void go(){
        System.out.println("Поехали");
    }

    public static void changeWheel(){
        Wheel wheel = new Wheel(19, "winter");
    }

    public static void refuel(){
        System.out.println("Заправляемся");
    }


    public static void main(String[] args) {
        Wheel wheel = new Wheel(20, "summer");
        Engine engine = new Engine(300, 4);
        Car car = new Car("BMW", "Red", 00001);

        go();
        changeWheel();
        refuel();
        System.out.println("Mark : " + car.getMark());
    }
}