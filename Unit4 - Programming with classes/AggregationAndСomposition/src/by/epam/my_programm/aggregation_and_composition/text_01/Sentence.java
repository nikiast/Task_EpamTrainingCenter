package by.epam.my_programm.aggregation_and_composition.text_01;

public class Sentence {
    private String sentence;

    Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String toString() {
        return sentence;
    }
}