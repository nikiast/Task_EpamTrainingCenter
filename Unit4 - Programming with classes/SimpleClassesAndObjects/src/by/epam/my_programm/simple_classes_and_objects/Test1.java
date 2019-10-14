package by.epam.my_programm.simple_classes_and_objects;

public class Test1 {
    static int one = 1;
    static int two = 2;

    public static void Sout(){
        System.out.println(one + " " + two);
    }

    public static void Change(){
        one = 2;
        two = 3;
    }

    public static void Sum(){
        int three = one + two;
    }

    public static void LargestNumber(){

        if(one > two){
            System.out.println("Наибольшее число: " + one );
        }else{
            System.out.println("Наибольшее число: " + two );
        }
    }

    public static void main(String[] args) {
        Sout();
        Change();
        Sum();
        LargestNumber();
    }
}