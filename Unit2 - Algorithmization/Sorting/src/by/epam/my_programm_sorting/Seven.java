package by.epam.my_programm_sorting;

public class Seven {

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 4, 5, 6, 8, 9, 11, 14, 16};
        int [] arr2 = {0, 5, 6, 8, 10, 12, 132};

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr1.length; j++) {
                if(arr2[i] < arr1[j]){
                    System.out.println("Число " + arr2[i] + " нужно поставить на место с индексом " + j);
                    break;
                }
            }
        }
    }
}