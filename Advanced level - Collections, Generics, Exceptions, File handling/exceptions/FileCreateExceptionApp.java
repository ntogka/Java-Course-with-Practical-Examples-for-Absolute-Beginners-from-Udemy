package advanced.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreateExceptionApp {

    public static void main(String[] args) {

        createFile("outputFile.txt");

    }

    private static void createFile(String fileName) {
        //PrintWriter outputFile = null;
        try (PrintWriter outputFile = new PrintWriter(new FileWriter(fileName))) {
            outputFile.println("Hello");
        } catch (IOException exception) {
            System.out.println("Caught an IOException: " + exception.getMessage());
            //createFile("1-" + fileName);
        } /*finally {
            if (outputFile != null) {
                outputFile.close();
                System.out.println("The printWrite is closed.");
            } else {
                System.out.println("The printWrite is not open.");
            }*/
        System.out.println("This line comes after we tried to create a file.");
    }

}
