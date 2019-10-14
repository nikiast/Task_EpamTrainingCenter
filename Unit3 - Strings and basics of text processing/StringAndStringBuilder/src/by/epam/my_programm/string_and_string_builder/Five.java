package by.epam.my_programm.string_and_string_builder;

public class Five {

    public static void main(String[] args) {
        String line = "abc bca cab ";
        int quantity = 0;

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == 'a'){
                quantity++;
            }
        }
        System.out.println("Искомый символ встречается: " + quantity + " раз(a)");

    }
}