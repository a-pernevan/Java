import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileHandlingString {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("java.txt");
        int data = fileReader.read();
        System.out.println("File data: ");
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }
        fileReader.close();
        System.out.println();

        String new_data = "I love Java!";
        FileWriter fileWriter = new FileWriter("java.txt", true);
        fileWriter.write(new_data);
        System.out.println("Data written successfully");
        fileWriter.close();
    }
}
