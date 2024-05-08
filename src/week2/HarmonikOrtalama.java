package week2;

import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dizi = {3,4,11,6};

        int n = dizi.length;

        double sum = 0;
        for (int i : dizi){
            sum += i;
        }
        double harmonicMean = n / sum;

        System.out.println("Sayıların harmonik ortalaması: " + harmonicMean);

    }
}
