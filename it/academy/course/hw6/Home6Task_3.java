package it.academy.course.hw6;

public class Home6Task_3 {
    public static void main(String[] args) {
        String sentence = "Those who notice what the world has to offer are greatly rewarded";
        System.out.println("Original sentence: " + sentence);

        String[] words = sentence.split("\\s*[\\s!,.-]\\s*");
        int longestIndex = 0;
        int shortestIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) {
                continue;
            }
            if (words[i].length() > words[longestIndex].length()) {
                longestIndex = i;
            }
            if (words[i].length() < words[shortestIndex].length()) {
                shortestIndex = i;
            }
        }
        System.out.print("New sentence: ");
        sentence(words, longestIndex, shortestIndex);

    }

    public static void sentence(String[] words, int longestIndex, int shortestIndex) {
        for (String word : words) {
            String temp = words[longestIndex];
            words[longestIndex] = words[shortestIndex];
            words[shortestIndex] = temp;
            System.out.print(word + " ");
        }
    }
}
