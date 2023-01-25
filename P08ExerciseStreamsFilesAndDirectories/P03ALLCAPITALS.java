package P08ExerciseStreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P03ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\ralei\\IdeaProjects\\JavaAdvancedJan23\\src\\P08ExerciseStreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        for (String line : allLines) {
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();

//        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
//        String line = reader.readLine();
//        while (line != null){
//            writer.write(line.toUpperCase());
//            writer.newLine();
//        }
//        writer.close();          ----->second way
    }
}
