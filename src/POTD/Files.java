package POTD;
import java.io.File;
import java.io.IOException;

public class Files {
    static void main(String[] args) {
        File nameTextFile = new File("name.txt");
        try {
            if (nameTextFile.createNewFile()) {
                System.out.println("File created: " + nameTextFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
        
    }
}
