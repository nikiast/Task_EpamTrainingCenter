package by.epam.my_programm.to_char_array;

public class Four {

    public static void main(String[] args) {

        String s = "w5orld 15abc 5letter5 cba132";
        char[] ch = s.toCharArray();
        int quantity = 0;
        int n = 0;
        boolean number;

        for (int i = 0; i < ch.length; i++){
            number = Character.isDigit(ch[i]);
            if(number) {
                n++;
            } else {
                n = 0;
            }
            if (n == 1) {
                quantity++;
            }
        }
        System.out.println("Кол-во чисел: " + quantity);
    }
}