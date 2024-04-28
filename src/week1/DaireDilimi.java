package week1;

import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {

        double r, a;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = scanner.nextDouble();

        System.out.print("Merkez açısı ölçüsünü giriniz : ");
        a = scanner.nextDouble();

        double field = ((pi * (r * r) * a) / 360);

        System.out.print("Daire diliminin alanı : " + field);

    }
}
