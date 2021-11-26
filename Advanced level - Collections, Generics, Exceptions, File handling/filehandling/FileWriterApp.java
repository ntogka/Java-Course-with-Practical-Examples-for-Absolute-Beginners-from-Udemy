package advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {

    public static void main(String[] args) {
        String JULIUS_CESAR_FILE_PATH = "src/advanced/filehandling/JuliusCesar.txt";

        try(FileWriter bookWriters = new FileWriter(JULIUS_CESAR_FILE_PATH, true)) { //true oste na ksana mpei keimeno sto arxeio
            bookWriters.write("Even you, Brutus?");
            bookWriters.append("\nYes.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
