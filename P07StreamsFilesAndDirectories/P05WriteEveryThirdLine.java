package P07StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String basePath = "C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P05WriteEveryThirdLine.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer = new PrintStream(new FileOutputStream(outputPath))) {

            int lineCount = 1;
            String line = reader.readLine();
            while (line != null){
                if (lineCount % 3 == 0){
                    writer.println(line);
                }
                line = reader.readLine();
                lineCount++;
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
