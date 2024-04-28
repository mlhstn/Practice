package week1;

import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int total = 0;

        while (number != 0) {

            total += number % 10;
            number /= 10;

        }
        System.out.println("Sayının basamaklarının toplamı: " + total);
    }
}
