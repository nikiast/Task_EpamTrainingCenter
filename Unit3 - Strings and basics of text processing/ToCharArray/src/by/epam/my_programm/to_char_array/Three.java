package by.epam.my_programm.to_char_array;

public class Three {

    public static void main(String[] args) {

        String s = "w5orld 15abc letter cba132";
        char[] ch = s.toCharArray();
        int quantity = 0;
        boolean flag;

        for (int i = 0; i < ch.length; i++){
            flag = Character.isDigit(ch[i]);
            if(flag){
                quantity++;
            }
        }
        System.out.println("Кол-во цифр: " + quantity);
    }
}