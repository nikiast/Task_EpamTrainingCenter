package by.epam.my_programm.decomposition;

public class Six {

    static int oneNum = 26;
    static int twoNum = 27;
    static int threeNum = 38;

    public static void conditionCheck(){

        int min = Math.min(Math.min(oneNum, twoNum), Math.min(oneNum, threeNum));
        int n = 1;

        for (int i = 2; i <= min; i++) {
            if(oneNum % i == 0 && twoNum % i == 0 && threeNum % i == 0){
                System.out.println("Числа не взаимно простые");
            }else{
                n++;
            }
        }

        if(n == min){
            System.out.println("Числа взаимно простые");
        }
    }

    public static void main(String[] args) {
        conditionCheck();
    }
}