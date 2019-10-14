package by.epam.my_programm.to_char_array;

public class Five {

    public static void main(String[] args) {

        String s = "   w5orld   15abc  5letter5 cba132   ";

        String twoSpaces = "  ";
        s = s.trim();

        while(s.indexOf(twoSpaces) >= 0) {
            s = s.replace("  ", " ");
        }
        System.out.println(s);
    }
}
