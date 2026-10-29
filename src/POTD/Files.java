package POTD;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Files {
    static void main(String[] args) {
        String filePath = "name.txt";
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

            
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }


    }
}
