package P08ExerciseStreamsFilesAndDirectories;

import java.io.File;

public class P08GetFolderSize {
    public static void main(String[] args) {

        String pathFolder = "C:\\Users\\ralei\\IdeaProjects\\JavaAdvancedJan23\\src\\P08ExerciseStreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(pathFolder);

        File[] allFilesInFolder = folder.listFiles();

        int foldersSize = 0;
        if (allFilesInFolder != null) {
            for (File file : allFilesInFolder) {
                foldersSize += file.length();
            }
        }
        System.out.println("Folder size: " + foldersSize);
    }
}
