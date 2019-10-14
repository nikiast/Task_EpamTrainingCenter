package by.epam.my_programm.string_and_string_builder;

public class Test {

    public static void main(String[] args) {
        String line = "петя петушок бубубу";
        int count = 0;
        int lenght = 0;

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ' '){
                count++;
            }
        }

        String[] arr = new String[count+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";

            for (int j = lenght; j < line.length(); j++) {

                if(line.charAt(j) != ' ') {
                    arr[i] += line.charAt(j);
                    lenght++;
                }else{
                    lenght++;
                    break;
                }
            }
        }

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