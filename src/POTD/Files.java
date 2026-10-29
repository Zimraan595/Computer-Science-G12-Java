package POTD;
import java.io.File;
import java.io.IOException;
import java.io.Writer;

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
            Writer nameTextFileWriter = new Writer(filePath);
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }


    }
}
