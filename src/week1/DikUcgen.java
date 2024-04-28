package week1;

import java.util.Scanner;

public class DikUcgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç kenar uzunluğunu alın
        System.out.print("Üçgenin ilk kenar uzunluğunu girin:");
        double kenar1 = scanner.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu girin:");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin:");
        double kenar3 = scanner.nextDouble();

        // Üçgenin alanını hesaplayın
        double s = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));

        // Alanı ekrana yazdırın
        System.out.print("Üçgenin alanı: " + alan);

    }
}
