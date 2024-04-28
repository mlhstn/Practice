package week1;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n,r;
        int ntotal = 1;
        int rtotal = 1;
        int nrtotal = 1;

        System.out.print("n sayısını giriniz : ");
        n = scanner.nextInt();

        System.out.print("r sayısını giriniz : ");
        r =  scanner.nextInt();

        for (int i = 1; i <= n; i++){

            ntotal *= i;

        }
        for (int i = 1; i <= r; i++){

            rtotal  *= i;

        }
        for (int i = 1; i <= (n-r); i++){

            nrtotal *= i;
        }

        double kombinasyon = ntotal / (rtotal * nrtotal);

        System.out.print("Kombinasyon = " + kombinasyon);


    }
}
