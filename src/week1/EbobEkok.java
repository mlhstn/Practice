package week1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        int ebob =1;
        int k = n1 ;

        while (k >= 1){
            k--;
            if (n1 % k == 0 && n2 % k == 0){

                ebob = k;
                break;
            }
        }
        System.out.println("Ebob = " + ebob);

        int ekok = 1;
        int i = (n1*n2);

        while (i <= (n1*n2)){
            i--;

            if (i % n1 ==0 && i % n2 == 0){
               ekok = i;
               break;
            }

        }
        System.out.print("ekok = " + ekok);

    }
}
