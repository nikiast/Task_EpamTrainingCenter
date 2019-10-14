package by.epam.my_programm.aggregation_and_composition.text_01;

public class Word {
    private String word;

    Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public String toString() {
        return word;
    }
}