package by.epam.my_programm.simple_classes_and_objects;

public class Test2 {

    private int one;
    private int two;

    private Test2(int one, int two){
        this.one = one;
        this.two = two;
    }

    private int getOne(){
        return one;
    }

    private int getTwo(){

        return two;
    }

    public void setOne(int one) {

        this.one = one;
    }

    public void setTwo(int two) {

        this.two = two;
    }

    public static void main(String[] args) {
        Test2 test1 = new Test2(3, 4);

        System.out.println(test1.getOne() + " " + test1.getTwo());
    }
}