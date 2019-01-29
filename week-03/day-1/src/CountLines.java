import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.


       Path filePath = Paths.get ("assets/my-file.txt");
       int visszater = countLinesInFile(filePath);
       System.out.println(visszater);
    }

    
    public static int countLinesInFile (Path filepath) {
        int fileLineNumber = 0;
        try {
            List<String> lista = Files.readAllLines(filepath);
            fileLineNumber = lista.size();
            return fileLineNumber;
        }

        catch (Exception ex) {
            return fileLineNumber;
        }

    }
}