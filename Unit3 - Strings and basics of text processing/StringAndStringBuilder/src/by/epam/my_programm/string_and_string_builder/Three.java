package by.epam.my_programm.string_and_string_builder;

public class Three {
    public static void main(String[] args) {
        String s = "спел лепс";
        char [] ch = s.toCharArray();
        int j = ch.length-1;
        int count = 0;
        for (int i = 0; i < ch.length; i++){
            if(ch[i] == ch[j]){
                count ++;
                j--;
            }
        }
        if(count == ch.length){
            System.out.println("Слово является полиндромом");
        }
    }
}