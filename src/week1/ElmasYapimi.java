package week1;

import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını giriniz :");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){

            for (int k = 1; k<= (n - i); k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n-1; i >= 1; i--){
            for (int k = 1; k < (n - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
