package in.namishkumar.namishjava;

/* Wecome to FileService for NamishJava 1.0.1 */
/* FileService version 1.0.0 */
/* Latest Update on 31 October 2022 */
import java.io.File;
import java.io.IOException;

// The FileService Main Class
public class FileService {
    public static void main(String[] args) {

    }

    // Creates a new File
    // Retu
    public static void CreateFile(String FilePath) {
        try {
            File StaticFileObject = new File(FilePath);
            if (StaticFileObject.createNewFile()) {
                // File has been successfully created
                int x = 80;
            } else {
                // Throw the error
                String FatalError = "NamishJava Defaults <FileService.java>, package : in.namishkumar.namishjava.FileService returned fatal error! The file already exists!";
                System.out.println(FatalError);
            }
        } catch (IOException exception) {
            String ErrorMessage = "NamishJava <Error.Type.UnexpectedError>: Unexpected error in FileSystem.class!";
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
