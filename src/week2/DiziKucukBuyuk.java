package week2;

import java.util.Arrays;
import java.util.Scanner;

public class DiziKucukBuyuk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu yazınız : ");
        int n = scanner.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++){

            System.out.print((i+1)+ ". sayıyı giriniz : ");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

    }
}
