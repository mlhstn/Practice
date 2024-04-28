package week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double n1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double n2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int select = scanner.nextInt();

        double result = 0;

        switch (select) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }

        System.out.println("Sonuç: " + result);

    }
}
