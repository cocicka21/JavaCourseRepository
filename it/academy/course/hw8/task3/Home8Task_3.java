package it.academy.course.hw8.task3;

import java.util.List;

public class Home8Task_3 {
    public static void main(String[] args) {
        Cloth cloth = new Cloth("T-shirt", SizeCloth.XS, "blue");
        Shoes shoes = new Shoes("sneakers", SizeShoes.EU_34, "red");
        Cloth cloth1 = new Cloth("cap", SizeCloth.XS, "yellow");
        Shoes shoes1 = new Shoes("boots", SizeShoes.EU_41, "black");
        Cloth cloth2 = null;
        Shoes shoes2 = null;
        Shop shop = new Shop();
        shop.addCloth(cloth);
        shop.addShoes(shoes);
        shop.addCloth(cloth1);
        shop.addShoes(shoes1);
        shop.addCloth(cloth2);
        shop.addShoes(shoes2);
        Shoes findShoesWithColorAndSize = shop.findShoesByColorAndSize("red", SizeShoes.EU_34);
        if (findShoesWithColorAndSize == null) {
            System.out.println("not found");
        } else {
            System.out.println("found " + findShoesWithColorAndSize);
        }
        Cloth findClothWithColorAndSize = shop.findClothByColorAndSize("blue", SizeCloth.XS);
        if (findClothWithColorAndSize == null) {
            System.out.println("not found");
        } else {
            System.out.println("found " + findClothWithColorAndSize);
        }
        boolean boughtShoes = shop.buyShoes(shoes2);
        if (boughtShoes) {
            System.out.println("bought " + shoes2);
        } else {
            System.out.println("not purchased");
        }

        boolean boughtCloth = shop.buyCloth(cloth2);
        if (boughtCloth) {
            System.out.println("bought " + cloth2);
        } else {
            System.out.println("not purchased");
        }

        Cloth areAvailableCloth = shop.availableCloth("cap", SizeCloth.XXL, "yellow");
        if (areAvailableCloth == null){
            System.out.println("not available");
        } else {
            System.out.println("selected product : " + areAvailableCloth);
        }

        Shoes areAvailableShoes = shop.availableShoes("sneaker", SizeShoes.EU_34, "red");
        if (areAvailableShoes == null) {
            System.out.println("not available");
        } else {
            System.out.println("selected product : " + areAvailableShoes);
        }

        List<Cloth> allCloseWithSizeFinded = shop.allClothWithSize(SizeCloth.XS);
        System.out.println("found close in this size " + allCloseWithSizeFinded);
        List<Shoes> allShoesWithSizeFinded = shop.allShoesWithSize(SizeShoes.EU_41);
        System.out.println("found shoes in this size " + allShoesWithSizeFinded);
    }
}
