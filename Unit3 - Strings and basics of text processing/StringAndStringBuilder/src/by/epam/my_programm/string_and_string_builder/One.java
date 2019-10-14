package by.epam.my_programm.string_and_string_builder;

public class One {

    public static void main(String[] args) {
        String s = "acb   bca   cbad aaa";
        String twoSpaces = "  ";

        while (s.indexOf(twoSpaces) >= 0) {
            s = s.replace("  ", " ");
        }
        System.out.println(s);
    }
}