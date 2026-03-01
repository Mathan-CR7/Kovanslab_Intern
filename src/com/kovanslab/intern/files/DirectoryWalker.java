package com.kovanslab.intern.files;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class DirectoryWalker  {

    public static void main(String[] args) {

        Path startPath = Paths.get("C:\\kovanintern");
        try (Stream<Path> paths = Files.walk(startPath)) {
            paths.filter(Files::isRegularFile).forEach(p -> {
                try {
                    System.out.println("File : " + p.toAbsolutePath() + " | Size : " + Files.size(p) + " bytes");
                } catch (IOException e) {
                    System.out.println("No File is there");
                }
            });
        } catch (IOException e) {
            System.out.println("Folder not found");
        }
    }
}