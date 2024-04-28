package week1;

import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int km ,age,type;


        System.out.print("Mesafeyi km türünden giriniz :");
        km = scanner.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        type = scanner.nextInt();

        if (km  <= 0 || age <= 0 || (type !=1 && type !=2)){
            System.out.println("Hatalı veri girdiniz.");
            return;
        }
        double kmPrice = 0.10;
        double totalPrice = (km * kmPrice);


        if (age < 12){
            totalPrice *= 0.50;


        } else if (age >= 12 && age < 24) {
            totalPrice *= 0.90;


        } else if (age > 65) {
            totalPrice *= 0.70;

        }

        if (type == 2){
            totalPrice = (totalPrice * 0.80)*2 ;


        }
        System.out.println(totalPrice);

    }
}
