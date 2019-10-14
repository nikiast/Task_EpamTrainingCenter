package by.epam.my_programm.decomposition;

public class Sixteen {

    static int num1 = 1352;
    static int num2 = 753;
    static int sum = 0;

    public static void character1(){
        int character1 = num1;

        int counter = 0;
        while (character1 != 0){
            if (character1 % 2 != 0){
                counter++;
                character1 /= 10;
            }else{
                System.out.println("Число " + num1 + " нам не подходит");
                num1 = 0;
                break;
            }
        }
        if(counter == 3){
            System.out.println("Число " + num1 + " нам подходит");
        }
    }

    public static void character2(){
        int character2 = num2;

        int counter = 0;
        while (character2 != 0){
            if (character2 % 2 != 0){
                counter++;
                character2 /= 10;
            }else {
                System.out.println("Число " + num1 + " нам не подходит");
                num2 = 0;
                break;
            }
        }
        if(counter == 3){
            System.out.println("Число " + num2 + " нам подходит");
        }
    }

    public static void sumNum(){
        sum = num1 + num2;
        System.out.println("Сумма = " + sum);

        int findEvenNum = sum;
        int counter = 0;
        while (findEvenNum != 0) {
            if (findEvenNum % 2 == 0) {
                counter++;
            }
            findEvenNum /= 10;
        }
        System.out.println("Четных цифр в числе " + sum + " - " + counter);
    }

    public static void main(String[] args) {
        character1();
        character2();
        sumNum();
    }
}