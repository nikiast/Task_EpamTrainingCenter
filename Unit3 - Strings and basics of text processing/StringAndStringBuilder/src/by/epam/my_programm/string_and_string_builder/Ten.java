package by.epam.my_programm.string_and_string_builder;

public class Ten {

    public static void main(String[] args) {
        String line = "asdda ? asdasd! asdasd.";
        int quantity = 0;

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '?' || line.charAt(i) == '!' || line.charAt(i) == '.'){
                quantity++;
            }
        }
        System.out.println("Найдено " + quantity + " предожения(й)");
    }
}