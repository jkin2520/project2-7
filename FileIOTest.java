import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class FileIOTest {
    @Test
    public void testWriteToFile() throws IOException {
        FileIO.writeToFile("testfile.txt", "Hello, World!");
        String content = FileIO.readFile("testfile.txt"); // This will throw error as methods don’t exist yet.
        assertEquals("Hello, World!", content);
    }
}
