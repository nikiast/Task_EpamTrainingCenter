package by.epam.my_programm.reg_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {

    public static void main(String[] args) {

        String text = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        textAnalyzer(text);
    }


    public static void textAnalyzer(String text){

        Pattern p = Pattern.compile("\n");
        String [] arr = p.split(text);

        Pattern openP = Pattern.compile("<\\w.+?>");
        Pattern closedP = Pattern.compile("</\\w+>");
        Pattern bodyP = Pattern.compile(">.+?<");
        Pattern noBodyP = Pattern.compile("<\\w.+?/>");

        for (String array : arr) {

            Matcher openM = openP.matcher(array);
            Matcher closedM = closedP.matcher(array);
            Matcher bodyM = bodyP.matcher(array);
            Matcher noBodyM = noBodyP.matcher(array);

            if (openM.find()) {
                System.out.println("Открывающий тег: " + openM.group());
            }

            if(bodyM.find()){
                System.out.println("Тело тега: " + bodyM.group());
            }

            if (noBodyM.find()) {
                System.out.println("Тег без тела: " + noBodyM.group());
            }

            if(closedM.find() ){
                System.out.println("Закрывающий тег: " + closedM.group());
            }
        }
    }
}