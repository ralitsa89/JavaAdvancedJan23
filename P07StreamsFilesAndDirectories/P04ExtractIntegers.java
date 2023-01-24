package P07StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.in;

public class P04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {


        String basePath = "C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P04ExtractIntegers.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));

        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                writer.println(reader.nextInt());
            }
            reader.next();
        }
    }
}
