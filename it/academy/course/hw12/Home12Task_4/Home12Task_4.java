package it.academy.course.hw12.Home12Task_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Home12Task_4 {
    public static void main(String[] args) {
        Person vova = new Person("Vova", "Victorovich", 29);
        Person petia = new Person("Petia", "Borisov", 19);
        Person olya = new Person("Olya", "Rima", 31);
        Person kate = new Person("Kate", "Jhonson", 30);
        Person andrew = new Person("Andrew", "Kristof", 24);
        List<Person> persons = new ArrayList<>();
        persons.add(vova);
        persons.add(petia);
        persons.add(olya);
        persons.add(kate);
        persons.add(andrew);
        try {
            File serial = new File("H:\\Intellij idea\\projects\\git\\it\\academy\\course\\hw12\\Home12Task_4\\PersonsVersion.txt");
            if (serial.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Files already exists");
            }
            serialization(serial, persons);
            List<Person> newPersons = deserialization(serial);
            System.out.println("Sorted list of peoples :");
            Collections.sort(newPersons, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    int result = o1.getSurname().compareTo(o2.getSurname());
                    if (result != 0) {
                        return result;
                    }
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (Person person : newPersons) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void serialization(File file, List<Person> person) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static List<Person> deserialization(File file) {
        List<Person> persons = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            persons = ((List<Person>) objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }
        for (Person person : persons) {
            System.out.println(person);
        }
        return persons;
    }
}