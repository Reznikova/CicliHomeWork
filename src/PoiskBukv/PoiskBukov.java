package PoiskBukv;

public class PoiskBukov {


    public static void main(String[] args) {
        String str = "Мама встала рано утром";
        int max = str.length();
        int chetchik = 0;
        char sim = 'т';
        for (int i = 0; i < max; i++) {
            if (str.charAt(i) == sim) {
                chetchik++;
            }System.out.println(str.charAt(chetchik++));
        }


    }
}

