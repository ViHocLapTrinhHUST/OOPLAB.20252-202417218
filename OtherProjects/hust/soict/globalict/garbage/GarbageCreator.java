package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.exe"; // Hoặc file bất kỳ dung lượng lớn [cite: 936]
        byte[] inputBytes = {0};
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char)b; // Đây là chỗ tạo ra rác [cite: 952]
            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (Exception e) { e.printStackTrace(); }
    }
}