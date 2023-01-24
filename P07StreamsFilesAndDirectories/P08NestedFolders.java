package P07StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import static java.lang.System.in;

public class P08NestedFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        File file = new File("C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> deque = new ArrayDeque<>();

        deque.add(file);

        int count = 0;
        while (!deque.isEmpty()) {
            File f = deque.poll();
            count++;
            System.out.println(f.getName());

            File[] files = f.listFiles();
            for (File innerFile : files) {
                if (innerFile.isDirectory()) {
                    deque.offer(innerFile);
                }
            }
        }
        System.out.println(count + " folders");
    }
}