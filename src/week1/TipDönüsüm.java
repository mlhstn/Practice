package week1;

import java.util.Scanner;

public class TipDönüsüm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz : ");
        int n1 = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz : ");
        double n2 = scanner.nextDouble();

        double newN1 = n1;

        int newN2 = (int) n2 ;

        System.out.println(newN1);

        System.out.print(newN2);
    }
}
