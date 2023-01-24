package P07StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P06SortLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);

        String basePath = "C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P06SortLines.txt";

        Path path = Paths.get(inputPath);
        List<String> sortedLines = Files.readAllLines(path)
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Path output = Paths.get(outputPath);
        Files.write(output, sortedLines);
    }
}
