package by.epam.my_programm.decomposition;

public class Thirteen {

    static int n = 20;

    public static void twins(){
        for (int i = n; i <= n*2 - 2; i++){
            System.out.println("Числа " + i + " и " + (i+2) + " являются 'близницами'");
        }
    }

    public static void main(String[] args) {
        twins();
    }
}