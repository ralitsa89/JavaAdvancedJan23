package P07StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class P03CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String basePath = "C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P03CopyBytes.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int readByte = inputStream.read();

            while (readByte >= 0) {

                if (readByte == 10 || readByte == 32) {
                    outputStream.write(readByte);
                }else{
                    String number = String.valueOf(readByte);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }
                }
                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
