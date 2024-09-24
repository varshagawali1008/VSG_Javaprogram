
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a line of text: ");
            String line = reader.readLine();
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


