package by.epam.my_programm.string_and_string_builder;

public class Nine {

    public static void main(String[] args) {
        String line = "aBc AbC";
        boolean flag;
        int quantityHigh = 0;
        int quantityLow = 0;

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' '){
                continue;
            }
            flag = Character.isUpperCase(line.charAt(i));
            if(flag){
                quantityHigh++;
            }else{
                quantityLow++;
            }
        }
        System.out.println("В верхнем регистре: " + quantityHigh);
        System.out.println("В нижнем регистре: " + quantityLow);
    }
}