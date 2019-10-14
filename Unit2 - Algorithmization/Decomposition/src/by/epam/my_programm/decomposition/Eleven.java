package by.epam.my_programm.decomposition;

public class Eleven {

    static int num1 = 123123;
    static int num2 = 123123123;

    public static void numberLength(){

        String a = String.valueOf(num1);
        String b = String.valueOf(num2);

        if(a.length() > b.length()){
            System.out.println("Первое число больше");
        }else{
            System.out.println("Второе число больше");
        }
    }

    public static void main(String[] args) {
        numberLength();
    }
}