package week1;

import java.util.Scanner;

public class VucutKitleIndeks {

    public static void main(String[] args) {

        double kg, m;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        m = scanner.nextDouble();

        double indeks = kg / (m * m);

        System.out.print("Vücut kitle indeksiniz : " + indeks);
    }
}
