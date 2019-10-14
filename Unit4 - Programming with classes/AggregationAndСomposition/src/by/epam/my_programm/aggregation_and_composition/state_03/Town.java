package by.epam.my_programm.aggregation_and_composition.state_03;

public class Town {
    private String nameTown;
    private String regionalCenter;
    private String capital;

    Town(String name, String regionalCenter, String capital){
        this.nameTown = name;
        this.regionalCenter = regionalCenter;
        this.capital = capital;
    }

    public String getNameTown() {
        return nameTown;
    }
    public void setNameTown(String nameTown) {
        this.nameTown = nameTown;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }
    public void setRegionalCenter(String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String toString(){
        return "Name town: " + getNameTown() + "; regional center: " + getRegionalCenter()
                + "; capital: " + getCapital();
    }
}
