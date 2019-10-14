package by.epam.my_programm.decomposition;

public class Three {

    static int hexagonSide = 5;

    public static void hexagonArea(){

        double areaOfTriangle = Math.pow(hexagonSide, 2) * Math.sqrt(3) / 4;
        System.out.println("Площадь шестиугольника = " + areaOfTriangle * 6);

    }

    public static void main(String[] args) {
        hexagonArea();
    }
}