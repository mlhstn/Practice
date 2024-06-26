package week4.MaceraOyunu;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya hoş geldiniz!");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış yap");
            System.out.print("Seçiminiz : ");
            int selectCase = scanner.nextInt();
            while (selectCase < 1 || selectCase > 3){
                System.out.print("Geçersiz bir değer girdiniz, tekrar bir değer giriniz");
                selectCase = scanner.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("---------Silahlar ---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId() + " - " +w.getName() + " Para :" + w.getPrice() + " Hasar : " + w.getDamage());
        }
        System.out.println("0 - Çıkış Yap");

    }
    public void buyWeapon(){

        System.out.print("Bir Silah seçiniz : ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Geçersiz bir değer girdiniz, tekrar bir değer giriniz");
            selectWeaponID = scanner.nextInt();
        }

        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null){
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                }else {
                    // Satın almanın gerçekleştiği alan
                    System.out.println(selectedWeapon.getName() + "silahını satın aldınız!");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("kalan bakiyeniz : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }
        }
    }


    public void printArmor() {
        System.out.println("--------- Zırhlar ---------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() + ", Para : " + a.getPrice() + ", Zırh :>" + a.getBlock());
        }
        System.out.println("0 - Çıkış Yap");
    }
    public void buyArmor(){
        System.out.print("Bir Zırh seçiniz : ");
        int selectArmorID = scanner.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.print("Geçersiz bir değer girdiniz, tekrar bir değer giriniz");
            selectArmorID = scanner.nextInt();
        }
        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null){
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("kalan bakiyeniz : " + this.getPlayer().getMoney());
                }
            }
        }

    }
}






















