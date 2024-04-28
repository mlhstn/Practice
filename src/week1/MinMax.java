package week1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n,k;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz ? ");
        n = scanner.nextInt();


        int i= 1 ;
        while(i <= n){

            System.out.print(i + ". sayıyı giriniz: ");
            k= scanner.nextInt();
            i++;

            if (k < min){
                min = k;
            }
            if (k > max){
                max = k;
            }

        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}
