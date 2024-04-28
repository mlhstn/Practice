package week1;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int n;
        double result = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını giriniz : ");
        n = scanner.nextInt();

        for (double i = 1; i <= n; i++){

            result += (1/i);
        }

        System.out.print(result);

    }
}
