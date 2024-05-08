package week2;

public class DiziFrekans {
    public static void main(String[] args) {

        int[] dizi = {3,6,4,3,5,4,2,2,2,8,4,6,3};
        int n = dizi.length;

        int[] frekanslar = new int[n];
        boolean[] ziyaretEdildi = new boolean[n];

        // Her elemanın frekansı
        for (int i = 0; i < n; i++) {
            if (!ziyaretEdildi[i]) {
                int frekans = 1;
                for (int j = i + 1; j < n; j++) {
                    if (dizi[i] == dizi[j]) {
                        frekans++;
                        ziyaretEdildi[j] = true;
                    }
                }
                frekanslar[i] = frekans;
            }
        }

        // Sonuçlar
        System.out.println("Dizi elemanlarının frekansları:");
        for (int i = 0; i < n; i++) {
            if (!ziyaretEdildi[i]) {
                System.out.println(dizi[i] + ": " + frekanslar[i] + " kez tekrar edildi");
            }
        }
    }
}