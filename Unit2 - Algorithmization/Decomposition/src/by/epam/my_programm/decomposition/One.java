package by.epam.my_programm.decomposition;

public class One {

    static int firstNumber = 500;
    static int secondNumber = 36;
    static int gcf;
    static int lcm;

    public static void greatestCommonFactor (){

        int min = Math.min(firstNumber, secondNumber);
        for (int i = 1; i <= min; i++){
            if(firstNumber % i == 0 && secondNumber % i == 0){
                gcf = i;
            }
        }
        System.out.println("НОД: " + gcf);
    }

    public static void leastCommonMultiple(){

        lcm = firstNumber * secondNumber / gcf;
        System.out.println("НОК: " + lcm);

    }

    public static void main(String[] args) {
        greatestCommonFactor();
        leastCommonMultiple();
    }
}