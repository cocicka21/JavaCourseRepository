package it.academy.course.hw10.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PetStore {
    List<Pet> pets;

    public PetStore() {
        pets = new ArrayList<Pet>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void sortByNick() {
        Collections.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getNickName().compareTo(o2.getNickName());
            }
        });
    }

    public void sortByPrice() {
        Collections.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public ArrayList<Pet> searchByPriceRange(double minPrice, double maxPrice) {
        ArrayList<Pet> matchPets = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.getPrice() >= minPrice && pet.getPrice() <= maxPrice) {
                matchPets.add(pet);
            }
        }
        return matchPets;
    }

    public Pet buyPet(String name) {
        for (Pet pet : pets) {
            if (pet.getNickName().equalsIgnoreCase(name)){
                pets.remove(pet);
                return pet;
            }
        }
        return null;
    }
    public List<Pet> getPets(){
        return pets;
    }
}