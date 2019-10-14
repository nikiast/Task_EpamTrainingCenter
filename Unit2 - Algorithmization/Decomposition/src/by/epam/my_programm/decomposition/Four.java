package by.epam.my_programm.decomposition;

public class Four {

    static int [] arr = {1,2, 0,0, 5,6};

    public static void distanceCalculation() {

        double maxDistance = 0;
        double distanceAB = 0;

        for (int i = 1; i < arr.length ; i+=2) {
            for (int j = 3; j < arr.length ; j+=2) {
                distanceAB =  Math.sqrt (Math.pow((arr[j-1] - arr[i-1]),2) + Math.pow((arr[j] - arr[i]),2));
            }
            if (distanceAB > maxDistance){
                maxDistance = distanceAB;
            }

        }
        System.out.println(maxDistance);
    }

    public static void main(String[] args) {
        distanceCalculation();
    }
}