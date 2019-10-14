import java.util.Scanner;

public class LineProgram {

    public static void main(String[] args) {

        //  Линейный программы
        //  1.Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
        //  2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //  𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
        //  3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //  𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡
        //  4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        //  Поменять местами дробную и целую части числа и вывести полученное значение числа.
        //  5.Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        //  Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
        //  6.Для данной области составить линейную программу, которая печатает true,
        //  если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае.

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while (!flag){

            System.out.println("Для выхода введите 10");
            System.out.print("Введите номер задачи (от 1 до 6): ");
            int taskNumber = scan.nextInt();

            switch (taskNumber) {

                case 1:

                    // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

                    System.out.println("Введите значение а: ");
                    double a = input.nextDouble();

                    System.out.println("Введите значение b: ");
                    double b = input.nextDouble();

                    System.out.println("Введите значение c: ");
                    double c = input.nextDouble();

                    double z = ((a - 3) * b / 2) + c;
                    System.out.println("Результат: " + z);
                    break;

                case 2:

                    //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                    // 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2

                    System.out.println("Введите значение а: ");
                    a = input.nextDouble();

                    System.out.println("Введите значение b: ");
                    b = input.nextDouble();

                    System.out.println("Введите значение c: ");
                    c = input.nextDouble();

                    z = (b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c) / 2 * a - Math.pow(a, 3) * 3 + Math.pow(b, -2);
                    System.out.println("Результат:  " + z);
                    break;

                case 3:

                    //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                    // (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡

                    System.out.println("Введите значение x: ");
                    double x = input.nextDouble();

                    System.out.println("Введите значение y: ");
                    double y = input.nextDouble();

                    z = ((Math.sin(x) - Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
                    System.out.println("Результат:  " + z);
                    break;

                case 4:

                    //4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
                    // Поменять местами дробную и целую части числа и вывести полученное значение числа.

                    System.out.println("Введиие число (nnn,zzz): ");
                    x = input.nextDouble();

                    double r = (x = (int) x / 1000.0 + (x - (int) x) * 1000);
                    System.out.println("Результат:  " + r);
                    break;

                case 5:

                    //5.Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
                    // Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

                    System.out.print("Введите число: ");
                    double t = input.nextDouble();

                    int hours = (int) t / 3600;
                    int minutes = (int) t / 60;

                    if (hours > 0) {
                        minutes = minutes - hours * 60;
                    }

                    int seconds = (int) t % 60;
                    System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
                    break;

                case 6:

                    //6.Для данной области составить линейную программу, которая печатает true,
                    // если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае.

                    System.out.print("Введите значение x: ");
                    x = input.nextDouble();

                    System.out.print("Введите значение y: ");
                    y = input.nextDouble();

                    boolean result = false;
                    if (x >= -4 && y >= -3 && x <= 4 && y <= 0) {
                        result = true;
                    } else if (x >= -2 && y >= 0 && x <= 2 && y <= 4) {
                        result = true;
                    }

                System.out.println(result);
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
