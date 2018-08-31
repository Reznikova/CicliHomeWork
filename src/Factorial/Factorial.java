package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int c = 1;
        System.out.println("Введите число");
        if (a.hasNextInt()) {
            int b = a.nextInt();
            int sum = b;
            for (int i = 1; i <= b; i++) {
                sum = sum * b;
                System.out.println(sum);
            }

        }

    }
}
