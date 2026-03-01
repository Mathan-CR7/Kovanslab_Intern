package com.kovanslab.intern.files;
import java.io.File;
public class FolderExample
{
    static void createFolder(String filePath)
    {
        File file =new File(filePath);

        if(!file.exists())
        {
            file.mkdir();
            System.out.println("Folder is Created");
        }
    }

    static void renameFolder(String oldPath,String newPath)
    {
        File old =new File(oldPath);
        File newfold =new File(newPath);

        if(old.exists())
        {
            old.renameTo(newfold);
            System.out.println("Folder Renamed Successfully");
        }
    }

    static void deleteFolder(String filePath)
    {
        File f= new File(filePath);
        if(f.exists())
        {
            for(File fi : f.listFiles())
            {
                fi.delete();
            }
        }
        f.delete();

        System.out.println("Folder Deleted Succesfully");
    }
    public static void main(String[] args)
    {

        createFolder("C:\\mathan");
        renameFolder("C:\\mathan", "C:\\mathanprashath");
        deleteFolder("C:\\mathanprashath");
    }
}