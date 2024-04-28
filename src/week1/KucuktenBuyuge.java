package week1;

import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz : ");
        n3 = scanner.nextInt();

        if ((n1 < n2) && (n1 < n3)){

            if (n2 < n3){
                System.out.println("n1 < n2 < n3");
            }else {
                System.out.println("n1 < n3 < n2");
            }
        } else if ((n2 < n1 ) && (n2 < n3)) {
            if (n1 < n3 ){
                System.out.println("n2 < n1 < n3");
            }else{
                System.out.println("n2 < n3 < n1");
            }
        }else {
            if (n3 < n2){
                System.out.println("n3 < n1 < n2");
            }else {
                System.out.println("n3 < n2 < n1");
            }
        }
    }
}
