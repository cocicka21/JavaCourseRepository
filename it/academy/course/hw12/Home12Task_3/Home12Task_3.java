package it.academy.course.hw12.Home12Task_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Home12Task_3 {
    public static void main(String[] args) {
        try {
            File file = new File("H:\\Intellij idea\\projects\\git\\it\\academy\\course\\hw12\\Home12Task_3\\text.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Files already exists");
            }
            fillOfNumbers(file);
            List<Integer> list = readFile(file);
            countAverage(list);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void fillOfNumbers(File file) throws IOException {
        FileWriter wFile = new FileWriter(file);
        for (int i = 0; i < 30; i++) {
            int rndNumbers = (int) (Math.random() * 101);
            String binary = Integer.toBinaryString(rndNumbers);
            wFile.write(binary + "\n");
        }
        wFile.close();
        System.out.println("The files is filled with data");
    }

    public static List<Integer> readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<Integer> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line, 2));
        }
        return list;
    }

    public static void countAverage(List<Integer> list) {
        double sum = 0;
        double quantity = 0;
        for (int elem : list) {
            sum += elem;
            quantity++;
            System.out.println(elem);
        }
        double avg = sum / quantity;
        System.out.println("Average of numbers : " + avg);

    }
}
