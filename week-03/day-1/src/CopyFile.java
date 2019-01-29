import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class CopyFile {
    public static void main(String[] args) {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

        //For example, if I want to copy my-file3.txt to my-file4.txt:
        //System.out.println(copyFileToAnotherFile("assets/my-file3.txt", "assets/my-file4.txt"));

    }


    public static boolean copyFileToAnotherFile (String fileCopyFrom, String fileCopyTo) {
        boolean succesful;
        try {
            // This could be done in one line:
            // ArrayList<String> listToStoreCopiedContents = new ArrayList<>(Files.readAllLines(Paths.get(fileCopyFrom)));

            ArrayList<String> listToStoreCopiedContents = new ArrayList<>();
            listToStoreCopiedContents.addAll(Files.readAllLines(Paths.get(fileCopyFrom)));
            Files.write(Paths.get(fileCopyTo), listToStoreCopiedContents);
            return succesful = true;
        } catch (Exception ex) {
            return succesful = false;
        }
    }

}