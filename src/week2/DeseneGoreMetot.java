package week2;

import java.util.Scanner;

public class DeseneGoreMetot {

    public static void geriyeSay(int sayi) {
        if (sayi <= 0) {
            System.out.println(sayi);
            return;
        }

        System.out.println(sayi);
        geriyeSay(sayi - 5);
        System.out.println(sayi);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int girilenSayi = scanner.nextInt();

        geriyeSay(girilenSayi);
    }
}
