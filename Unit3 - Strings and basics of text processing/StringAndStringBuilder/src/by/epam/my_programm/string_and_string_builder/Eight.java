package by.epam.my_programm.string_and_string_builder;

public class Eight {

    public static void main(String[] args) {
        String line = "петя петушок бубубу";
        String [] arr = line.split(" ");
        int maxLine = 0;
        int indexMaxLine = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLine) {
                maxLine = arr[i].length();
                indexMaxLine = i;
            }
        }

        System.out.println(arr[indexMaxLine]);
    }
}