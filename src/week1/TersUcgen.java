package week1;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
