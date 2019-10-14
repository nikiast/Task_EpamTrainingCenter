package by.epam.my_programm.decomposition;

public class Seven {

    public static void sumOfFactorials(){

        int finalSum = 0;

        for (int i = 1; i <= 9; i++) {
            if(i % 2 != 0){

                int sumFact = 1;

                for (int j = 1; j <= i; j++) {
                    sumFact *= j;
                }
                finalSum += sumFact;
            }
        }
        System.out.println("Сумма факториалов от 1 до 9 = " + finalSum);
    }

    public static void main(String[] args) {
        sumOfFactorials();
    }
}