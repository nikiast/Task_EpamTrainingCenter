package by.epam.my_programm.aggregation_and_composition.text_01;

public class Text {
    private Word heading;
    private Sentence text;

    Text(Word heading, Sentence text) {
        this.heading = heading;
        this.text = text;
    }

    Word getHeading() {
        return this.heading;
    }
    void setHeading(Word heading) {
        this.heading = heading;
    }

    Sentence getText() {
        return text;
    }
    void setText(Sentence text) {
        this.text = text;
    }

    public String toString() {
        return "Heading: " + heading + "\n Text: " + text;
    }
}
