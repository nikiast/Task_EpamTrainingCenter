package by.epam.my_programm.decomposition;

public class Nine {

    static int x = 3;
    static int y = 4;
    static int z = 6;
    static int t = 7;
    static double c;
    static double areaQuadrangle;
    static double areaTriangle1;
    static double areaTriangle2;

    public static void areaFirstTriangle(){
        c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        areaTriangle1 = 0.5 * 4 * 3;
    }

    public static void areaSecondTriangle(){
        double halfPerimeter = 0.5 * (z + t + c);
        areaTriangle2 = Math.sqrt(halfPerimeter * (halfPerimeter - z) * (halfPerimeter - t) * (halfPerimeter - c));
    }

    public static void quadrangleArea(){
        areaQuadrangle = areaTriangle1 + areaTriangle2;
        System.out.println("Площадь четырехугольника: " + areaQuadrangle);
    }

    public static void main(String[] args) {
        areaFirstTriangle();
        areaSecondTriangle();
        quadrangleArea();
    }
}