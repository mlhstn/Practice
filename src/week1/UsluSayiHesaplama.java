package week1;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int n, k;
        int total = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı yazınız : ");
        n = scanner.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++){

            total *= n;
        }

        System.out.println("üs :" + total);
    }
}
