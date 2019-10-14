package by.epam.my_programm.string_and_string_builder;

public class Six {

    public static void main(String[] args) {
        String s = "информатика";
        String result = "";

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < 2; j++) {
                result += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}