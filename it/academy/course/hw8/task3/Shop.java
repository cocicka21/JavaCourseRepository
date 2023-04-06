package it.academy.course.hw8.task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Cloth> clothes;
    List<Shoes> shoes;

    public Shop() {
        clothes = new ArrayList<>();
        shoes = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        clothes.add(cloth);
    }

    public void addShoes(Shoes shoes) {
        this.shoes.add(shoes);
    }

    public Cloth findClothByColorAndSize(String color, SizeCloth size) {
        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).color.equalsIgnoreCase(color) && clothes.get(i).size.equals(size)) {
                return clothes.get(i);
            }
        }
        return null;
    }

    public Shoes findShoesByColorAndSize(String color, SizeShoes size) {
        for (int i = 0; i < shoes.size(); i++) {
            if (shoes.get(i).color.equalsIgnoreCase(color) && shoes.get(i).size.equals(size)) {
                return shoes.get(i);
            }
        }
        return null;
    }

    public boolean buyCloth(Cloth cloth) {
        return clothes.remove(cloth);
    }

    public boolean buyShoes(Shoes shoes) {
        return this.shoes.remove(shoes);
    }

    public Cloth availableCloth(String name, SizeCloth size, String color) {
        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).name.equalsIgnoreCase(name) && clothes.get(i).size.equals(size) && clothes.get(i).color.equals(color)) {
                return clothes.get(i);
            }
        }
        return null;
    }


    public Shoes availableShoes(String name, SizeShoes size, String color) {
        for (int i = 0; i < shoes.size(); i++) {
            if (shoes.get(i).name.equalsIgnoreCase(name) && shoes.get(i).size.equals(size) && shoes.get(i).color.equals(color)) {
                return shoes.get(i);
            }
        }
        return null;
    }

    public List<Cloth> allClothWithSize(SizeCloth size) {
        List<Cloth> allCloth = new ArrayList<>();
        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).size.equals(size)) {
                allCloth.add(clothes.get(i));
            }
        }
        return allCloth;
    }

    public List<Shoes> allShoesWithSize(SizeShoes size) {
        List<Shoes> allShoes = new ArrayList<>();
        for (int i = 0; i < shoes.size(); i++){
            if (shoes.get(i).size.equals(size)){
                allShoes.add(shoes.get(i));
            }
        }
        return allShoes;
    }

}
