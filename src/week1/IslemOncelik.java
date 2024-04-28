package week1;

import java.util.Scanner;

public class IslemOncelik {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayısını giriniz : ");
        a = scanner.nextInt();

        System.out.print("b sayısını giriniz : ");
        b = scanner.nextInt();

        System.out.print("c sayısını giriniz : ");
        c = scanner.nextInt();

        int result = (a+(b*c)-b);

        System.out.println("İşlem sonucunuz : " + result);
    }
}
