package week1;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        int k;
        int total = 0;
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        k=scanner.nextInt();

        for (int i = 1; i <= k; i++){
            if (i % 3 == 0 && i % 4 == 0 ){

                total +=i;
                number++;
            }
        }

        double avarage = (total / number);

        System.out.print("Sayıların ortalaması : " + avarage);
    }
}
