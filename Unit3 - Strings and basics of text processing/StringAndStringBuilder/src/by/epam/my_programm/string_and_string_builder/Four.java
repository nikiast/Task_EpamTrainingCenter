package by.epam.my_programm.string_and_string_builder;

public class Four {

    public static void main(String[] args) {
        String s = "информатика";

        String result = String.valueOf(s.charAt(s.indexOf('т')));
        result += String.valueOf(s.charAt(s.indexOf('о')));
        result += String.valueOf(s.charAt(s.indexOf('р')));
        result += String.valueOf(s.charAt(s.indexOf('т')));

        System.out.println(result);
    }
}