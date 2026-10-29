package POTD;
import java.io.File;

public class Files {
    static void main(String[] args) {
        File nameTextFile = new File("name.txt");
        nameTextFile.createNewFile();
    }
}
