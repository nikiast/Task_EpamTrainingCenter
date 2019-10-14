package by.epam.my_programm.aggregation_and_composition.state_03;

public class Region {
    private int area;
    private String nameRegion;
    private Town regionalCenter;

    Region(String nameRegion, int area,Town regionalCenter){
        this.nameRegion = nameRegion;
        this.area = area;
        this.regionalCenter = regionalCenter;
    }

    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }

    public String getNameRegion() {
        return nameRegion;
    }
    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public Town getRegionalCenter() {
        return regionalCenter;
    }
    public void setRegionalCenter(Town regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public String toString(){
        return "Name region: " + getNameRegion() + "; area: " + getArea() + "; " + getRegionalCenter();
    }
}
