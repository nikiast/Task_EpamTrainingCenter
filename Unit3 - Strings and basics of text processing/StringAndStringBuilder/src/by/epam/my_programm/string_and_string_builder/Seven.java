package by.epam.my_programm.string_and_string_builder;

public class Seven {

    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("abc cde def");


        for (int i = 0; i < line.length(); i++) {
            char isRepeat = line.charAt(i);
            for (int j = i + 1; j < line.length(); j++) {
                if (isRepeat == line.charAt(j)) {
                    line.deleteCharAt(j);
                    j--;
                }
            }
        }
        line.deleteCharAt(line.indexOf(" "));
        System.out.println(line);
    }
}