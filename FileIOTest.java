import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class FileIOTest {

    @Test
    public void testWriteToFile() throws IOException {
        FileIO.writeToFile("testfile.txt", "Hello, World!");
        String content = FileIO.readFile("testfile.txt");
        assertEquals("Hello, World!", content);
    }

    @Test
    public void testReadFile() throws IOException {
        FileIO.writeToFile("testfile2.txt", "This is a test");
        String content = FileIO.readFile("testfile2.txt");
        assertEquals("This is a test", content);
    }

    @Test
    public void testAppendToFile() throws IOException {
        FileIO.writeToFile("testfile3.txt", "Hello");
        FileIO.appendToFile("testfile3.txt", ", World!");
        String content = FileIO.readFile("testfile3.txt");
        assertEquals("Hello, World!", content);
    }
}
