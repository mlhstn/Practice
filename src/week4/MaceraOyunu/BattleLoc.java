package week4.MaceraOyunu;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    private Player player;




    public BattleLoc(Player player, String name,Obstacle obstacle,String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
        this.player = player;



    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObtacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor.");
        System.out.print("<S>avaş veya <K>aç" + ":");
        String selectCase = scanner.nextLine().toUpperCase();
        if (selectCase.equals("S") &&  combat(obsNumber)){
                System.out.println(this.getName() + " tün düşmanları yendiniz !");
                if (this.award.equals("food") && player.getInventory().isFood() == false){
                    System.out.println(this.award + " kazandınız ");
                    this.getPlayer().getInventory().setFood(true);
                } else if (this.award.equals("water") && player.getInventory().isWater() == false){
                    System.out.println(this.award + " kazandınız ");
                    this.getPlayer().getInventory().setWater(true);
                }else if (this.award.equals("wood") && player.getInventory().isWood() == false){
                    System.out.println(this.award + " kazandınız ");
                    this.getPlayer().getInventory().setWood(true);
                }
            return true;
        }

        if (this.getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz !");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);

            // İlk turda kullanıcıdan hamle yapmasını isteyin
            System.out.print("<V>ur veya <K>aç : ");
            String selectCombat = scanner.nextLine().toUpperCase();
            if (!selectCombat.equals("V")) {
                return false;
            }

            // İlk turda %50 şansla vuran tarafı belirleyin
            boolean playerTurn = Math.random() < 0.5;

            // İlk hamleyi %50 şansa göre yapın
            if (playerTurn) {
                System.out.println("Siz vurdunuz!");
                this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                afterHit();
            } else {
                System.out.println("Canavar size vurdu");
                int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                if (obstacleDamage < 0) {
                    obstacleDamage = 0;
                }
                this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                afterHit();
            }

            // İlk hamleden sonra sırayla devam edin
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                playerTurn = !playerTurn;

                if (playerTurn) {
                    System.out.print("<V>ur veya <K>aç : ");
                    selectCombat = scanner.nextLine().toUpperCase();
                    if (!selectCombat.equals("V")) {
                        return false;
                    }
                    System.out.println("Siz vurdunuz!");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                } else {
                    System.out.println("Canavar size vurdu");
                    int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obstacleDamage < 0) {
                        obstacleDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                    afterHit();
                }

                if (this.getPlayer().getHealth() <= 0 || this.getObstacle().getHealth() <= 0) {
                    break;
                }
            }


        }
        return true;
    }



    /* public boolean combat(int obsNumbeer){
        for (int i = 1; i <= obsNumbeer; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = scanner.nextLine().toUpperCase();
                if (selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz !");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("Canavar size vurdu");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage );
                        afterHit();
                    }
                }else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Düşmanı yendiniz !");
                System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());

            }else {
                return false;
            }
        }
        return true;
    } */
    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.getObstacle().getHealth());
        System.out.println("------------------");

    }

    public void playerStats(){
        System.out.println("Oyuncu değerleri");
        System.out.println("----------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri");
        System.out.println("--------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();
    }
    public int randomObtacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {

        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }


}

