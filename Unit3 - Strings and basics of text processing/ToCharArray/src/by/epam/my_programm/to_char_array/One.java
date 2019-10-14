package by.epam.my_programm.to_char_array;

public class One {

    public static void main(String[] args) {
        String s = "abC abcDabc";
        char[] ch = s.toCharArray();
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < ch.length; i++){
            flag = Character.isUpperCase(ch[i]);
            if (flag){
                count++;
            }
        }

        char[] newCh = new char[ch.length + count];
        int n = 0;

        for (int j = 0; j < newCh.length; j++){

            for (int i = 0; i < n; i++) {
                flag = Character.isUpperCase(ch[i]);

                if (flag) {
                    newCh[j] = '_';
                    newCh[j + 1] = Character.toLowerCase(ch[i]);
                    j++;
                }else{
                    newCh[j] = ch[i];
                }
            }
            n++;
        }
        s = s.copyValueOf(newCh);
        System.out.println(s);
    }
}
