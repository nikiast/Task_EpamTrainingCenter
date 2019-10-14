import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {

        //  Ветвления
        //  1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
        //  то будет ли он прямоугольный
        //  2. Найти max{min(a, b), min(c, d)}
        //  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
        //  4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        //  5. Вычислить значение функции

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {

            System.out.println("Для выхода введите 10");
            System.out.print("Введите номер задачи (от 1 до 5): ");
            int taskNumber = scan.nextInt();

            switch (taskNumber) {

                case 1:

                    //  1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
                    //  то будет ли он прямоугольный

                    System.out.println("Введите угол а: ");
                    double a = input.nextDouble();

                    System.out.println("Введите угол b: ");
                    double b = input.nextDouble();

                    if ((a + b) <= 180) {

                        System.out.println("Треугольник существует");
                        if (a == 90 || b == 90 || (270 - (a + b)) == 90) {
                            System.out.println("Треугольник прямоугольный");

                        }else{
                            System.out.println("Треугольник  не прямоугольный");
                        }
                    }else{
                        System.out.println("Треугольник не существует");
                    }
                    break;

                case 2 :

                    //  2. Найти max{min(a, b), min(c, d)}

                    System.out.println("Введите значение а: ");
                    a = input.nextDouble();

                    System.out.println("Введите значение b: ");
                    b = input.nextDouble();

                    System.out.println("Введите значение c: ");
                    double c = input.nextDouble();

                    System.out.println("Введите значение d: ");
                    double d = input.nextDouble();

                    double minAB = Math.min(a, b);
                    double minCD = Math.min(c, d);

                    double max = Math.max(minAB, minCD);

                    System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")}= " + max);
                    break;

                case 3:

                    //  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

                    System.out.println("Введите значение x1: ");
                    double x1 = input.nextDouble();

                    System.out.println("Введите значение y1: ");
                    double y1 = input.nextDouble();

                    System.out.println("Введите значение x2: ");
                    double x2 = input.nextDouble();

                    System.out.println("Введите значение y2: ");
                    double y2 = input.nextDouble();

                    System.out.println("Введите значение x3: ");
                    double x3 = input.nextDouble();

                    System.out.println("Введите значение y3 ");
                    double y3 = input.nextDouble();


                    if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
                        System.out.println("Точки лежат на одной прямой");

                    } else {
                        System.out.println("Точки не лежат на одной прямой");
                    }
                    break;

                case 4 :

                    //  4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.

                    System.out.println("Введите значение A: ");
                    double A = input.nextDouble();

                    System.out.println("Введите значение B: ");
                    double B = input.nextDouble();

                    System.out.println("Введите значение x: ");
                    double x = input.nextDouble();

                    System.out.println("Введите значение y: ");
                    double y = input.nextDouble();

                    System.out.println("Введите значение z: ");
                    double z = input.nextDouble();

                    if (A >= x && B >= z || A >= x && B >= y || A >= y && B >= z) {
                        System.out.println("Кирпич через отверстие пройдет");

                    }else if((A >= z && B >= x || A >= y && B >= x || A >= z && B >= y)){
                        System.out.println("Кирпич через отверстие пройдет");

                    }else{
                        System.out.println("Кирпич через отверстие не прйдет");

                    }

                    break;

                case 5:

                    //  5. Вычислить значение функции

                    System.out.println("Введите x: ");
                    x = input.nextDouble();

                    double f = 0;

                    if (x <= 3) {
                        f = Math.pow(x, 2) - 3 * x + 9;

                    } else if (x > 3) {
                        f = 1 / (Math.pow(x, 3) + 6);

                    }

                    System.out.println("F = " + f);
                    break;

                case 10:

                    flag = true;
                    break;

                default:

                    System.out.println("Неверное число");
            }
        }
    }
}