package P08ExerciseStreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\ralei\\IdeaProjects\\JavaAdvancedJan23\\src\\P08ExerciseStreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        long sum = 0;

        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);

//        byte[] allBytes = Files.readAllBytes(Path.of(pathToFile));
//        for (byte ascii : allBytes) {
//            if (ascii != 13 && ascii != 10) {
//                sum += ascii;
//            }
//        }
//        System.out.println(sum);                         --> second way
    }
}
