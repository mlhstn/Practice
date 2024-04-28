package week1;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {

        int k;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınır değerini giriniz : ");
        k = scanner.nextInt();

        for (int i = 1; i <= k ; i*=4){

            System.out.println("4 ün kuvvetleri : " + i);

        }
        for (int j = 1; j <= k; j*=5){

            System.out.println("5 in katları : " + j) ;
        }



    }
}
