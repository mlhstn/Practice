package week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz : ");
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 400 != 0 && year % 100 != 0) {
            System.out.println("Artık bir yıl girdiniz.");
        }else if (year % 4 == 0 && year % 400 == 0 && year % 100 == 0){
            System.out.println("Artık bir yıl girdiniz.");
        }else {
            System.out.println("Artık yıl değil.");
        }
    }
}
