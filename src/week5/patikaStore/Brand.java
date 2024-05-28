package week5.patikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Brand implements Comparable<Brand>{

    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Brand o) {
        return this.name.compareTo(o.name);
    }
    public String toString() {
        return "-" + name;
    }
    public static void add(){
        List<Brand> brandList = new ArrayList<>();

        brandList.add(new Brand(1,"Samsung"));
        brandList.add(new Brand(2,"Lenova"));
        brandList.add(new Brand(3,"Apple"));
        brandList.add(new Brand(4,"Huwaei"));
        brandList.add(new Brand(5,"Casper"));
        brandList.add(new Brand(6,"Asus"));
        brandList.add(new Brand(7,"HP"));
        brandList.add(new Brand(8,"Xiaomi"));
        brandList.add(new Brand(9,"Monster"));

        Collections.sort(brandList);
        for (Brand brand : brandList){
            System.out.println(brand);
        }
    }




}
