import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file2.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file2.txt"


    List<String> stringsToFileList = new ArrayList<>();
    stringsToFileList.add("Bence Bánszegi");
    writeFileFromStringList(stringsToFileList);

    }

    public static void writeFileFromStringList (List<String> insideList) {
        try {
            Files.write(Paths.get("assets/my-file2.txt"), insideList);
        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file2.txt");
        }



    }


}