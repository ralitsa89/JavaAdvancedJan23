package P08ExerciseStreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        String pathWords = "C:\\Users\\ralei\\IdeaProjects\\JavaAdvancedJan23\\src\\P08ExerciseStreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathWords));

        Map<String, Integer> countWords = new HashMap<>();
        for (String line : allLinesWithWords) {
            line = line.replaceAll("[\\.\\,\\?\\!\\:]", "");
            String[] wordOnCurrentRow = line.split("\\s+");
            Arrays.stream(wordOnCurrentRow).forEach(word -> {
                countWords.put(word, 0);
            });
        }
        String pathText = "C:\\Users\\ralei\\IdeaProjects\\JavaAdvancedJan23\\src\\P08ExerciseStreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allFilesWithText = Files.readAllLines(Path.of(pathText));
        for (String line : allFilesWithText) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (countWords.containsKey(word)) {
                    countWords.put(word, countWords.get(word) + 1);
                }
            }
        }
        PrintWriter writer = new PrintWriter("result.txt");
        countWords.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() +  " - " + entry.getValue()));
        writer.close();
    }
}
