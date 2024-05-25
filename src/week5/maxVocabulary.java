package week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class maxVocabulary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen metni giriniz : ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");



        HashMap<String,Integer> h = new HashMap<>();

        for (String w : words){
            if (h.containsKey(w)){
                h.put(w,h.get(w) + 1 );
            }else {
                h.put(w,1);
            }
        }
        //HashMap i yazdırma
        for (Map.Entry<String,Integer> entry : h.entrySet()){
            System.out.println("Kelime : " + entry.getKey() + " Sayısı : " + entry.getValue());
        }


    }
}
