package week2;

import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean isAsal(int sayi, int bolen){
        if (sayi <= 1){
            return false;

        } else if (bolen == sayi) {
            return true;

        } else if (sayi % bolen == 0) {
            return false;

        }else {
            return isAsal(sayi, bolen + 1);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }

    }
}
