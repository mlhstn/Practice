package week2;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarinSiralamasi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("dizinin eleman sayısını yazınız : ");

        int n = scanner.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++ ){

            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            list[i] = scanner.nextInt();

        }

        Arrays.sort(list);

        System.out.println("Küçükten büyüğe  :");

        for (int a : list){
            System.out.println(a + " ");
        }
    }
}
