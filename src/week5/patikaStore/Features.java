package week5.patikaStore;

public class Features {

    private int id;
    private int price;
    private int discount;
    private int stock;
    private String name;
    private String brand;
    private double screen;
    private  int bateryPower;
    private int ram;


    public Features(int id, int price, int discount, int stock, String name, String brand,
                    double screen, int bateryPower, int ram) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.screen = screen;
        this.bateryPower = bateryPower;
        this.ram = ram;

    }

    public Features() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getBateryPower() {
        return bateryPower;
    }

    public void setBateryPower(int bateryPower) {
        this.bateryPower = bateryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
