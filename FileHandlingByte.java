// import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingByte {
    public static void main(String[] args) throws IOException {

        // Reading data from a file
        // FileInputStream inputStream = new FileInputStream("java.txt");
        // int data = inputStream.read();
        // System.out.println("File data: ");
        // while (data != -1) {
        //     System.out.print((char) data);
        //     data = inputStream.read();
        // }
        // inputStream.close();

        // Writing data to a file
        String newContent = "I love Java";
        FileOutputStream outputStream = new FileOutputStream("java.txt", true);
        byte[] array = newContent.getBytes();
        outputStream.write(array);
        System.out.println("Data written successfully");
        outputStream.close();

    }
}
