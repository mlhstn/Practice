package week1;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double km, perKm = 2.20, total, startprice = 10;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilometreyi giriniz : ");
        km = scanner.nextDouble();

        total = startprice + (km * perKm);

        if(total < 20 && total > 0){

            System.out.println("Ödemeniz gereken ücret 20 tl dir");
        } else  {
            System.out.println("Ödemeniz gereken ücret : " + total);

        }
    }
}
