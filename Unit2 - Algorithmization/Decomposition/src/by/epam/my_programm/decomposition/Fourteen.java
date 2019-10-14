package by.epam.my_programm.decomposition;

public class Fourteen {

    static int k = 10000;

    public static void findArmstrong(){

        for (int i = 1; i <= k ; i++){
            if(i <= 9){
                System.out.print(i + " ");
            }else if (i > 9){

                int number = i;
                int characters = 0;
                int sum = 0;

                while (number != 0){
                    sum += number % 10;
                   number /= 10;
                    characters++;
                }
                double c = Math.pow(sum, characters);

                if(c == i){
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        findArmstrong();
    }
}