package week4.MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Macera oyununa hoş geldiniz !");
        System.out.print("Lütfen bir isim giriniz :");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !");
        System.out.println("burada yaşananların hepsi gerçek!");
        System.out.println("Lütfen bir karakter seçiniz : ");
        System.out.println("----------------------------------");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("******* Bölgeler ******* ");
            System.out.println("1 - Güvenli ev");
            System.out.println("2 - Eşya Dükkanı");
            System.out.println("3 - Mağara --> Dikkatli ol karşına zombi çıkabilir");
            System.out.println("4 - Orman --> Dikkatli ol karşına vampir çıkabilir");
            System.out.println("5 - Nehir --> Dikkatli ol karşına ayı çıkabilir");
            System.out.println("6 - Maden --> Dikkatli ol karşına yılan çıkabilir");
            System.out.println("0 - Çıkış yap ---> Oyunu sonlandır");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz :");
            int selectLoc = scanner.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz !");
            }
            if (location.getClass().getName().equals("SafeHouse")){
                if (player.getInventory().isFood() && player.getInventory().isWater() && player.getInventory().isWood() ){
                    System.out.println("Tebrikler oyunu kazandınız !");
                    break;
                }
            }
            if (location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Game Over");
                break;
            }
        }
    }
}
