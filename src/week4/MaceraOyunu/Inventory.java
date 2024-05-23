package week4.MaceraOyunu;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean water,food,wood;



    public Inventory() {
        this.weapon = new Weapon("yumruk",-1,0,0);
        this.armor = new Armor(-1,"paçavra",0,0);
        this.water = false;
        this.food = false;
        this.wood = false;


    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }
}
