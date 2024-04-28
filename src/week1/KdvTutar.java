package week1;

import java.util.Scanner;

public class KdvTutar {

    public static void main(String[] args) {

        double tutar;
        double kdvOran1 = 0.18;
        double kdvOran2 = 0.08;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı giriniz : ");
        tutar = scanner.nextDouble();

        double kdvTutar1 = tutar * kdvOran1;
        double kdvliTutar1 = tutar + kdvTutar1;

        double kdvTutar2 = tutar * kdvOran2;
        double kdvliTutar2 = tutar + kdvTutar2;

        if(tutar>0 && tutar<100){
            System.out.println("KDV siz tutar : " + tutar);
            System.out.println("KDV oranı : " + kdvOran1);
            System.out.println("KDV tutarı : " + kdvTutar1);
            System.out.println("KDV'li tutarı : " + kdvliTutar1);
        }
        else {
            System.out.println("KDV siz tutar : " + tutar);
            System.out.println("KDV oranı : " + kdvOran2);
            System.out.println("KDV tutarı : " + kdvTutar2);
            System.out.println("KDV'li tutarı : " + kdvliTutar2);
        }
    }
}
