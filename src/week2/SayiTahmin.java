package week2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            int selected = scanner.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0 ile 100 arası bir değer giriniz!");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            }else {

                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong[right] =selected;
                right++;

                System.out.println("Kalan hakkı : " + (5 - right));
            }

        }
        if (!isWin && !isWrong ){
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));

        }
    }
}
