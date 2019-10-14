package by.epam.my_programm.aggregation_and_composition.text_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList <Text> sent = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    static void addText(){

        Word heading = new Word("heading");
        Sentence sentence = new Sentence("There is text. ");
        Text text = new Text(heading, sentence);

        System.out.println("Want to complete the text? ");
        String condition = scan.nextLine();

        if(condition.equals("yes")) {

            System.out.print("add text: ");
            String newText = scan.nextLine();
            sentence.setSentence(sentence + newText);
        }
        sent.add(text);
    }

    static void outputText(){
        System.out.println(sent.toString());
    }

    public static void main(String[] args) {
        addText();
        outputText();
    }
}