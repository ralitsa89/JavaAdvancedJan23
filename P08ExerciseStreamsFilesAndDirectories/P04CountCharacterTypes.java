package P08ExerciseStreamsFilesAndDirectories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {


        int vowelsCount = 0;
        int punctCount = 0;
        int consonantsCount = 0;

        Set<Character> vowels = getVowels();
        Set<Character> punctuationalMarks = getPuntMarks();

        String pathToFile = "C:\\Users\\ralei\\IdeaProjects\\JavaAdvancedJan23\\src\\P08ExerciseStreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                if (currentSymbol == ' ') {
                    continue;
                }
                if (vowels.contains(currentSymbol)) {
                    vowelsCount++;
                } else if (punctuationalMarks.contains(currentSymbol)) {
                    punctCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4"));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Other symbols: " + consonantsCount++);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();

    }

    private static Set<Character> getPuntMarks() {
        Set<Character> marks = new HashSet<>();
        marks.add('?');
        marks.add('!');
        marks.add('.');
        marks.add(',');
        return marks;
    }

    private static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
