package by.epam.my_programm.simple_classes_and_objects;

public class Student {
    String fio;
    int numberGroups;
    int [] progress;

    Student(String fio, int numberGroups, int [] progress){
        this.fio = fio;
        this.numberGroups = numberGroups;
        this.progress = progress;
    }

    static Student [] stud = new Student[]{
            new Student("AAA", 1, new int []{9,5,7,8,9}),
            new Student("BBB", 1, new int []{9,10,9,8,9}),
            new Student("CCC", 1, new int []{5,4,7,6,3}),
            new Student("DDD", 1, new int []{10,10,10,10,10}),
            new Student("EEE", 1, new int []{9,9,9,9,9}),
            new Student("FFF", 2, new int []{9,5,4,8,4}),
            new Student("GGG", 2, new int []{9,9,8,9,10}),
            new Student("HHH", 2, new int []{9,10,9,10,9}),
            new Student("III", 2, new int []{3,4,5,8,6}),
            new Student("JJJ", 2, new int []{7,6,2,3,4}),
    };

    public static void Output(){

        for(int i = 0; i < stud.length; i++){
            int minProg = 9;

            for (int j = 0; j < stud[i].progress.length; j++){
                if(stud[i].progress[j] < minProg){
                    minProg = stud[i].progress[j];
                }
            }

            if(minProg >= 9) {
                System.out.println("Имя студента: " + stud[i].fio + " группа: " + stud[i].numberGroups);
            }
        }
    }

    public static void main(String[] args) {
        Output();
    }
}