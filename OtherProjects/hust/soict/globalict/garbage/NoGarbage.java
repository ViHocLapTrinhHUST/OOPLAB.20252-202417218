package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "test.exe";
        byte[] inputBytes = {0};
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char)b); // Tối ưu [cite: 970]
            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (Exception e) { e.printStackTrace(); }
    }
}