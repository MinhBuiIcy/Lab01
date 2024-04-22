import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreatorBuffer {
    public static void main(String[] args) {
        String filename = "test.exe";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
    // Do something with the bytes read from the file
        } catch (IOException e) {
            e.printStackTrace(); // Or handle the exception in an appropriate way
        }   
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
