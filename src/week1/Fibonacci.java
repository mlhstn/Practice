package week1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci serisi:");

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
