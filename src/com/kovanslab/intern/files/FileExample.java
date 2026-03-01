package com.kovanslab.intern.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void createFile(String filePath) {

        File m = new File(filePath);

        try {
            if (m.createNewFile()) {
                System.out.println("File created: " + m.getName());
                System.out.println("Location: " + m.getAbsolutePath());
            }
            else {
                System.out.println("File is already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeFile(String filePath)
    {
        try
        {
            FileWriter fw = new FileWriter(filePath);
            fw.write("HII I AM MATHAN PRASHATH");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }

    public static void readFile(String filePath) {
        File file = new File(filePath);
        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public static void renameFile(String oldPath,String newPath)
    {
        File f= new File(oldPath);
        File n =new File(newPath);

        if(f.renameTo(n))
        {
            System.out.println("File is Renamed");
        }
        else{
            System.out.println("The File is not Renamed");
        }
    }

    public static void deleteFile(String filePath)
    {
        File v= new File(filePath);
        if(v.delete())
        {
            System.out.println("File Deleted Successfully");
        }
        else{
            System.out.println("File not Exists");
        }
    }

    public static void main(String[] args) {
        createFile("C:\\kovan\\sample.txt");
        writeFile("C:\\kovan\\sample.txt");
        readFile("C:\\kovan\\sample.txt");
        renameFile("C:\\kovan\\sample.txt", "C:\\kovan\\sample1.txt");
        deleteFile("C:\\kovan\\sample.txt");
        deleteFile("C:\\kovan\\sample1.txt");
    }
}