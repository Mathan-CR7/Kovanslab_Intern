package com.kovanslab.intern.files;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
public class NIO2FolderExample {

    public static void createFolder(String filePath)
    {
        Path p =Paths.get(filePath);
        try{
            Files.createDirectories(p);
            System.out.println("Folder Created Successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error Occur");
        }
        try{
            Stream<Path> s =Files.list(p);
            s.forEach(System.out::println);
        }
        catch(IOException n)
        {
            System.out.println("File not found");
        }

    }
    public static void createFile(String filePath, String fileName)
    {
        Path folder = Paths.get(filePath);
        Path file = folder.resolve(fileName);

        try
        {
            if(!Files.exists(file))
            {
                Files.createFile(file);
                System.out.println("File Created Successfully");
            }
            else
            {
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error Occurred ");
        }
    }

    public static void writeFile(String filePath,String fileName)
    {
        Path folder = Paths.get(filePath);
        Path file = folder.resolve(fileName);
        String data = "Mathan -90 \n Saran -80 \n  Mukesh-99";
        try{
            if(Files.exists(file))
            {
                Files.write(file,data.getBytes());
                System.out.println("Write data into file successfully");
            }
            else
            {
                System.out.println("File not exits");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
        }

        String newdata ="\n Ravi-95";
        try
        {
            Files.write(file, newdata.getBytes(), StandardOpenOption.APPEND);
            System.out.println("New Data added successfully");
        }
        catch(IOException e)
        {
            System.out.println("File not Found");
        }
    }

    public static void readData(String filePath,String fileName)
    {
        Path folder =Paths.get(filePath);
        Path file =folder.resolve(fileName);
        try
        {
            List<String> list = Files.readAllLines(file);
            for(String line : list)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error Occured");
        }

    }

    public static void copyFile(String oldFile,String newFile)
    {
        Path old = Paths.get(oldFile);
        Path newf =Paths.get(newFile);

        try
        {
            Files.copy(old, newf,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Copy Success");
        }
        catch(IOException e)
        {
            System.out.println("An error occur");
        }
    }

    public static void moveFile(String oldFile,String newFile)
    {
        Path old = Paths.get(oldFile);
        Path newf =Paths.get(newFile);

        try
        {
            Files.move(old, newf,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Moved Successfully");
        }
        catch(Exception e)
        {
            System.out.println("An Error Occur");
        }
    }
    public static void reName(String oldFile,String newFile)
    {
        Path old =Paths.get(oldFile);
        Path newf =Paths.get(newFile);

        try
        {
            Files.move(old, newf,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Renamed Successfully");
        }
        catch(IOException e)
        {
            System.out.println("An Error Occured");
        }
    }
    public static void main(String[] args)
    {
        createFolder("C:\\kovanintern");
        createFile("C:\\kovanintern", "java.txt");
        writeFile("C:\\kovanintern","java.txt");
        readData("C:\\kovanintern","java.txt");
        copyFile("C:\\kovanintern\\java.txt", "C:\\kovanintern\\copy.txt");
        moveFile("C:\\kovanintern\\copy.txt", "C:\\kovanintern\\move.txt");
        reName("C:\\kovanintern\\move.txt", "C:\\kovanintern\\move1.txt");
    }
}
