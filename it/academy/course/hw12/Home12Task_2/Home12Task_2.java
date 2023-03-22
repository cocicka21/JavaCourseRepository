package it.academy.course.hw12.Home12Task_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home12Task_2 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("H:\\Intellij idea\\projects\\git\\it\\academy\\course\\hw12\\Home12Task_2\\TextFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Files already exists");
            }
            String text = readFile(file);
            countNumberOfPunctuationMarks(text);
            countNumberOfWords(text);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static String readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line + " ");
        }
        br.close();
        text.deleteCharAt(text.length() - 1);
        return text.toString();
    }

    public static void countNumberOfPunctuationMarks(String text) {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Number of punctuation marks : " + count);
    }

    public static void countNumberOfWords(String text) {
        Pattern pattern = Pattern.compile("\\s*[\\w]\\b");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Number of words : " + count);
    }
}
