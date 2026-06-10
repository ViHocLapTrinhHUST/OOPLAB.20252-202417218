package hust.soict.globalict.garbage;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        System.out.println("Sử dụng +: " + (System.currentTimeMillis() - start) + "ms"); // Rất chậm [cite: 897]

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("Sử dụng StringBuilder: " + (System.currentTimeMillis() - start) + "ms"); // Rất nhanh [cite: 925]
    }
}