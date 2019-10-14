package by.epam.my_programm.decomposition;

public class Two {

    static int firstNumber = 400;
    static int secondNumber = 600;
    static int thirdNumber = 800;
    static int fourthNumber = 1000;
    static int gcf;

    public static void greatestCommonFactor (){

        int min = Math.min ( Math.min(firstNumber, secondNumber), Math.min(thirdNumber, fourthNumber) );
        
        for (int i = 1; i <= min; i++){
            if(firstNumber % i == 0 && secondNumber % i == 0
                    && thirdNumber % i == 0 && fourthNumber % i == 0){
                gcf = i;
            }
        }
        System.out.println("НОД: " + gcf);
    }

    public static void main(String[] args) {
        greatestCommonFactor();
    }
}