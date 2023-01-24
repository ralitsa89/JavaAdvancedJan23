package P07StreamsFilesAndDirectories;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.in;

public class P07ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String folderPath = "C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(folderPath);
        File[] nestedFiles = file.listFiles();

        for (File nestedFile : nestedFiles) {
            if (nestedFile.isFile()){
                System.out.printf("%s: [%d]%n", nestedFile.getName(), nestedFile.length());
            }
        }

    }
}

