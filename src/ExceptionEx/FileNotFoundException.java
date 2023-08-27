package ExceptionEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("nonexistent_file.txt")))
        {
            String line = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
