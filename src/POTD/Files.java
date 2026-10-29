package POTD;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {
    static void main(String[] args) {
        String filePath = "src/POTD/name.txt";
        File nameTextFile = new File(filePath);
        try {
            if (nameTextFile.createNewFile()) {
                System.out.println("File created: " + nameTextFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter nameTextFileWriter = new FileWriter(filePath);
            nameTextFileWriter.write("Hi this was made by my program");
            nameTextFileWriter.close();

            Scanner nameTextFileReader = new Scanner(nameTextFile);
            while (nameTextFileReader.hasNextLine()) {
                System.out.println(nameTextFileReader.nextLine());
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
