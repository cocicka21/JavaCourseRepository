package it.academy.course.hw10.task4;

public class Home10Task_4 {
    public static void main(String[] args) {
        PetStore store = new PetStore();
        Pet cat1 = new Pet("Biba", "cat", 150);
        Pet cat2 = new Pet("Chika", "cat", 100);
        Pet dog1 = new Pet("Bobik", "dog", 300);
        Pet dog2 = new Pet("Juchka", "dog", 200);
        Pet parrot1 = new Pet("Kesha", "parrot", 100);
        Pet parrot2 = new Pet("Jorik", "parrot", 250);
        store.addPet(cat1);
        store.addPet(cat2);
        store.addPet(dog1);
        store.addPet(dog2);
        store.addPet(parrot1);
        store.addPet(parrot2);
        System.out.println("Store before sorting");
        for (Pet pet : store.getPets()) {
            System.out.println(pet);
        }
        store.sortByNick();
        System.out.println("Store after sorting by nickname");
        for (Pet pet : store.getPets()) {
            System.out.println(pet);
        }

        store.sortByPrice();
        System.out.println("Store after sorting by price");
        for (Pet pet : store.getPets()) {
            System.out.println(pet);
        }

        System.out.println("Store by price range 100-200");
        for (Pet pet : store.searchByPriceRange(100, 200)) {
            System.out.println(pet);
        }

        Pet boughtPet = store.buyPet("kesha");
        if (boughtPet != null) {
            System.out.println("You buy pet Kesha");
            System.out.println("Store after the purchase");
            for (Pet pet : store.getPets()) {
                System.out.println(pet);
            }
        } else {
            System.out.println("Couldn't find a pet with that name");
        }

    }
}
