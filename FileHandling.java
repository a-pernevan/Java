import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("java.txt");
        int data = inputStream.read();
        System.out.println("File data: ");
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read();
        }
        inputStream.close();
    }
}
