package P07StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;

import static java.lang.System.in;

public class P01ReadFile {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\ralei\\OneDrive\\Desktop\\Java Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try(InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();
            while (readByte >= 0){
                System.out.print(Integer.toBinaryString(readByte) + " ");

                readByte = inputStream.read();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

//        InputStream inputStream = new FileInputStream(filePath);
//
//        int firstByte = inputStream.read();
//
//        System.out.println(firstByte);
//
//        inputStream.close();
    }
}
