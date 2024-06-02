package week6.notePad;

import java.io.*;

import java.util.Scanner;

public class NotePad {

    public static void main(String[] args) {
        // Kullanıcıdan metin girişi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Metni dosyaya kaydet
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\melih\\IdeaProjects\\Patica_Academy\\Task\\src\\week6\\notePad\\notlar.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            printWriter.close();
            System.out.println("Metin başarıyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }

        // Dosyadan metni oku ve ekrana yazdır
        try {
            FileReader fileReader = new FileReader("C:\\Users\\melih\\IdeaProjects\\Patica_Academy\\Task\\src\\week6\\notePad\\notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            bufferedReader.close();
            if (okunanMetin != null) {
                System.out.println("En son kaydedilen metin:");
                System.out.println(okunanMetin);
            } else {
                System.out.println("Henüz bir metin kaydedilmemiş.");
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}

