package by.epam.my_programm.aggregation_and_composition.state_03;

public class Main {

    private static Town [] town = new Town[6];
    private static District [] district = new District[6];
    private static Region [] region = new Region[6];

    static void printCapital(){
        for (Town town : town) {
            if(town.getCapital().equals("yes")){
                System.out.println(town.getNameTown() + " is the capital");
            }
        }
    }

    static void printNumberOfRegion(){
        int quantity = 0;
        for (Region reg : region) {
            quantity++;
        }
        System.out.println("Number Of Region: " + quantity);
    }

    static void printArea(){
        int area = 0;
        for (Region reg : region){
            area += reg.getArea();
        }
        System.out.println("Area: " + area);
    }

    static void printRegionalCenter(){
        for (Town town : town) {
            if(town.getRegionalCenter().equals("yes")){
                System.out.println("Regional center: " + town.getNameTown());
            }
        }
    }

    public static void main(String[] args) {
        town[0] = new Town("Minsk", "yes", "yes");
        town[1] = new Town("Brest", "yes", "no");
        town[2] = new Town("Vitebsk", "yes", "no");
        town[3] = new Town("Mogilev", "yes", "no");
        town[4] = new Town("Gomel", "yes", "no");
        town[5] = new Town("Grodno", "yes", "no");

        district[0] = new District("Minsk");
        district[1] = new District("Brest");
        district[2] = new District("Vitebsk");
        district[3] = new District("Mogilev");
        district[4] = new District("Gomel");
        district[5] = new District("Grodno");

        region[0] = new Region("Minsk", 1, town[0]);
        region[1] = new Region("Brest", 2, town[1]);
        region[2] = new Region("Vitebsk", 3,town[2]);
        region[3] = new Region("Mogilev", 4, town[3]);
        region[4] = new Region("Gomel", 5, town[4]);
        region[5] = new Region("Grodno", 6, town[5]);

        State state = new State("Belarus");

        printCapital();
        printNumberOfRegion();
        printArea();
        printRegionalCenter();
    }
}