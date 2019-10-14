package by.epam.my_programm.aggregation_and_composition.state_03;

public class State {
    private String nameState;

    State(String nameState){
        this.nameState = nameState;
    }

    public String getNameState() {
        return nameState;
    }
    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

}
