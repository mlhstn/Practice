package week1;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = scanner.nextInt();

        int toplamNotSayisi = 0;
        double toplamNot = 0;

        if (mat >= 0 && mat <= 100){
            toplamNot += mat;
            toplamNotSayisi ++;
        }
        if (fizik >= 0 && fizik <= 100){
            toplamNot += fizik;
            toplamNotSayisi ++;
        }
        if (turkce >= 0 && turkce <= 100){
            toplamNot += turkce;
            toplamNotSayisi ++;
        }
        if (kimya >= 0 && kimya <= 100){
            toplamNot += kimya;
            toplamNotSayisi ++;
        }
        if (muzik >= 0 && muzik <= 100){
            toplamNot += muzik;
            toplamNotSayisi ++;
        }

        double avarage = toplamNot / toplamNotSayisi;

        System.out.print("Not ortalamanız : " + avarage);



    }
}
