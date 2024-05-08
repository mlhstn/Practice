package week2;

import java.util.Scanner;

public class RecursiveUsAlma {

    static int usAlma(int taban, int us) {

        if (us == 0){
            return 1;

        } else if (us == 1) {

            return taban;

        }else {
            return taban * usAlma(taban,us - 1);
        }


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        int taban  = scanner.nextInt();

        System.out.print("Üs değerini giriniz  :");
        int us = scanner.nextInt();

        int sonuc = usAlma(taban,us);

        System.out.println("sonuç : " + sonuc);

    }
}
