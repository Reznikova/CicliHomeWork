package PologitelnieDeliteli;

import java.util.Scanner;

public class Deliteli {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (a.hasNextInt()) {
            int n = a.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }

else;
        System.out.println("Вы ввели неверное значение");
    }
}
