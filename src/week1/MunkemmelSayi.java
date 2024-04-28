package week1;

import java.util.Scanner;

public class MunkemmelSayi {
    public static void main(String[] args) {

        int total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++){

            if (number % i == 0 ){

                total += i;

            }
        }if (total == number){

            System.out.print(number + " Mükenmel sayıdır!");

        }else {

            System.out.print("münkemmel sayı değildir!");

        }
    }
}
