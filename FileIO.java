import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Writes content to a file. Overwrites the file if it already exists.
 * @param filename The name of the file.
 * @param content The content to write.
 * @throws IOException If an I/O error occurs.
 */
public class FileIO {
    public static void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
/**
 * Reads the content of a file.
 * @param filename The name of the file.
 * @return The file content as a string.
 * @throws IOException If an I/O error occurs.
 */
    }
public static String readFile(String filename) throws IOException {
    return new String(Files.readAllBytes(Paths.get(filename)));
    }
/**
 * Appends content to a file.
 * @param filename The name of the file.
 * @param content The content to append.
 * @throws IOException If an I/O error occurs.
 */
public static void appendToFile(String filename, String content) throws IOException {
    try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
        }
    }
    
}
