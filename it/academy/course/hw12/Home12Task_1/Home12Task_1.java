package it.academy.course.hw12.Home12Task_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home12Task_1 {
    public static void main(String[] args) throws IOException {
        try {
            File in1 = new File("H:\\Intellij idea\\projects\\git\\it\\academy\\course\\hw12\\Home12Task_1\\in1.txt");
            File in2 = new File("H:\\Intellij idea\\projects\\git\\it\\academy\\course\\hw12\\Home12Task_1\\in2.txt");
            File out = new File("H:\\Intellij idea\\projects\\git\\it\\academy\\course\\hw12\\Home12Task_1\\out.txt");

            if (in1.createNewFile() && in2.createNewFile() && out.createNewFile()) {
                System.out.println("Files created");
            } else {
                System.out.println("Files already exists");
            }
            List<Integer> list1;
            List<Integer> list2;
            fillOfNumbers(in1, in2);
            list1 = readNumbersFromFile(in1);
            list2 = readNumbersFromFile(in2);
            list2.addAll(list1);
            Collections.sort(list2);
            writeNumbersToFile(out, list2);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void fillOfNumbers(File file1, File file2) throws IOException {
        FileWriter wFile1 = new FileWriter(file1);
        FileWriter wFile2 = new FileWriter(file2);
        for (int i = 0; i < 1000; i++) {
            wFile1.write((int) (Math.random() * 100001) + "\n");
            wFile2.write((int) (Math.random() * 100001) + "\n");
        }
        wFile1.close();
        wFile2.close();
        System.out.println("The files is filled with data");
    }

    public static List<Integer> readNumbersFromFile(File file) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null){
            list.add(Integer.valueOf(line));
        }
        return list;
    }

    public static void writeNumbersToFile(File file, List<Integer> list) throws IOException {
        FileWriter fw = new FileWriter(file);
        for (int elem : list){
            fw.write(elem + "\n");
        }
        fw.close();
    }
}
