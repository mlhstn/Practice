package week1;

import java.util.Scanner;

public class ManavTutar {
    public static void main(String[] args) {

        double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, aubergine = 5.00;
        double pearkg, applekg, tomatoeskg, bananakg, auberginekg;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("kaç kilo armut : ");
        pearkg = scanner.nextDouble();

        System.out.print("Kaç kilo elma : ");
        applekg = scanner.nextDouble();

        System.out.print("Kaç kilo domates : ");
        tomatoeskg = scanner.nextDouble();

        System.out.print("kaç kilo muz : ");
        bananakg = scanner.nextDouble();

        System.out.print("Kaç kilo patlıcan : ");
        auberginekg = scanner.nextDouble();

        total = ((pearkg*2.14) + (applekg * 3.67) + (tomatoeskg * 1.11) + (bananakg * 0.95) + (auberginekg * 5.00));

        System.out.print("Toplam tutar : " + total);

    }
}
