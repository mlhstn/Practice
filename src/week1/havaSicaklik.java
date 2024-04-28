package week1;

import java.util.Scanner;

public class havaSicaklik {
    public static void main(String[] args) {

        int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            if (heat >= 10){
                System.out.println("pikniğe gidebilirsiniz.");
            }
        } else if (heat <= 25) {
            System.out.println("pikniğe gidebilirsiniz.");
        } else {
            System.out.println("yüzmeye gidebilirsiniz.");
        }
    }
}
