package week1;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = scanner.nextInt();

        int toplam = (mat + kimya + turkce + tarih + muzik);

        double ortalama = (toplam / 5);

        String sonuc = (ortalama > 60) ? "Geçtiniz" : "Kaldınız";

        System.out.println(sonuc);

    }
}
