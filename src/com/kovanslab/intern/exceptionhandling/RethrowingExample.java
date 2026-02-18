package com.kovanslab.intern.exceptionhandling;
import java.io.*;

class DataProcessingException extends RuntimeException {

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

class FileService {

    public static void readFile(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line = br.readLine();
            System.out.println("File content: " + line);

        } catch (IOException e) {

            throw new DataProcessingException(
                    "Unable to process data file",
                    e
            );
        }
    }
}

public class RethrowingExample{

    public static void main(String[] args) {

        try {
            FileService.readFile("abs.txt");
        }
        catch (DataProcessingException e) {

            System.out.println("Error Message : " + e.getMessage());
            System.out.println("Original Exception: " + e.getCause());
        }
        finally
        {
            System.out.println("Program Ended");
        }
    }
}
