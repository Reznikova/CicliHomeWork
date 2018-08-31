package Task1;

public class Each4 {
    public static void main(String[] args) {
       /* int a = 1000;
        while (a<1050) {
            System.out.println(a);
            a+=4;
        }*/
       int a = 2;
       int sum = 2;
       for (int i=1; i<=20; i++) {
           sum = sum*a;
           System.out.println(sum);
       }
       /*for (int a = 1, b = 2; a<=20; a++, b*=2) {
           System.out.println(b);
       }*/

    }
}
