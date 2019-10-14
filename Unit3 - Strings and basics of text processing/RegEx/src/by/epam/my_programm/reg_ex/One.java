package by.epam.my_programm.reg_ex;

import java.util.Scanner;

import java.util.regex.Pattern;

public class One {

    static String text = "Первый абзац? Два предложения и немного слов.\n" +
            "Второй абзац. Три! Предложения и немного больше слов.\n" +
            "Третий абзац. И будет. Четыре! Предложения с еще большим количеством слов.\n";



    public static void main(String[] args) {
        textSorting();
    }


    public static void textSorting (){

        Scanner scan = new Scanner(System.in);

        System.out.println("- введите 1 для сортировки абзацев по количеству предложений;\n" +
                           "- введите 2 для сортировки в каждом предложении слов по длине;\n" +
                           "- введите 3 для сортировки лексем в предложениях по убыванию количества \n" +
                           "  вхождений заданного символа, а в случае равенства - по алфавиту;\n" +
                           "- введите 4 для завершения работы приложения;");

        boolean flag = false;
        while (!flag) {
            System.out.print("Введите команду: ");
            int sort = scan.nextInt();

            switch (sort) {

                case 1:
                    sortingByNumberOfOffers();
                    break;

                case 2:
                    wordSortingInSentence();
                    break;

                case 3:
                    tokenSorting();
                    break;

                case 4:
                    System.out.println("Выход из приложения");
                    flag = true;
                    break;

                default:
                    System.out.println("Неверное число");
            }
        }
    }


    public static void sortingByNumberOfOffers(){

        String [] sortParagraph = text.split("\n");
        int firstQuantity = 0;
        int secondQuantity = 0;
        String buffer;

        for (int i = 0; i < sortParagraph.length; i++) {
            for (int j = 0; j < sortParagraph[i].length(); j++) {

                if (sortParagraph[i].charAt(j) == '?' || sortParagraph[i].charAt(j) == '!' || sortParagraph[i].charAt(j) == '.') {
                    firstQuantity ++;
                }
            }

            for (int k = i; k < sortParagraph.length; k++) {
                for (int j = 0; j < sortParagraph[k].length(); j++) {

                    if (sortParagraph[k].charAt(j) == '?' || sortParagraph[k].charAt(j) == '!' || sortParagraph[k].charAt(j) == '.') {
                        secondQuantity++;
                    }
                }

                if(secondQuantity > firstQuantity){
                    buffer = sortParagraph[i];
                    sortParagraph[i] = sortParagraph[k];
                    sortParagraph[k] = buffer;
                    secondQuantity = 0;
                }
            }
            firstQuantity = 0;
        }

        for (String i : sortParagraph) {
            System.out.println(i);
        }
    }


    public static void wordSortingInSentence(){

        Pattern pattern = Pattern.compile("\n");
        String [] sortParagrap = pattern.split(text);
        for (String paragrap : sortParagrap) {
            String[] sentences = paragrap.split("\\.*[.!?]\\s*");
            for (String sentence : sentences) {
                String[] words = sentence.split("\\s|,|;|:");


                for (int i = words.length - 1; i >= 0; i--) {

                    for (int j = 0; j < i; j++) {
                        if (words[j].length() > words[j+1].length()){
                            String buffer = words[j];
                            words[j] = words[j+1];
                            words[j+1] = buffer;
                        }
                    }
                }

                for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void tokenSorting(){
    }
}
