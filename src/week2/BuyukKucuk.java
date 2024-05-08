package week2;

import java.util.Arrays;
import java.util.Scanner;

public class BuyukKucuk {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        int kucuk = list[0];
        int buyuk = list[0];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = scanner.nextInt();

       Arrays.sort(list);
        System.out.println(Arrays.toString(list));

       for (int i = 0 ; i < list.length; i++){
           if (list[i] < n){
               kucuk = list[i];
           }
           else if (list[i] > n){

               buyuk = list[i];
               break;
           }
       }
        System.out.println("Küçük sayı : " + kucuk);
        System.out.println("Büyük sayı : " + buyuk);
    }

}
