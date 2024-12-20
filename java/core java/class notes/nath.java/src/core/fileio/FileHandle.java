package core.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandle {
   
    public static void main(String[] args) {
        File f = new File("D:\\message.txt");

//        System.out.println("File exists: " + f.exists());
//        System.out.println("Is file: " + f.isFile());

        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) {
                String data = s.nextLine(); 
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
    }
    }
}

