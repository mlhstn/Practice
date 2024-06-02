package week6.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SayiToplamaProgrami {
    public static void main(String[] args) {
        try {
            // Dosya yolu belirtilmeli
            String dosyaYolu = "C:\\Users\\melih\\IdeaProjects\\Patica_Academy\\Task\\src\\week6\\IO\\sayilar.txt";

            // Dosyayı okumak için BufferedReader kullanılır
            BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu));

            int toplam = 0;
            String satir;

            // Dosyadan her satırı okuyup toplama işlemi gerçekleştirilir
            while ((satir = reader.readLine()) != null) {
                int sayi = Integer.parseInt(satir);
                toplam += sayi;
            }

            // Dosya okuma işlemi bittikten sonra BufferedReader kapatılır
            reader.close();

            // Sonuç ekrana yazdırılır
            System.out.println("Dosyadan okunan sayıların toplamı: " + toplam);

        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Dosyada bir tam sayı değil: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
