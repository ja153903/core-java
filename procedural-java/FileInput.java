import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("What is your name? ");
        // String name = in.next();

        // System.out.println(name);
        try {
            Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
            while (in.hasNextLine()) {
                System.out.print(in.nextLine());
            }
            System.out.println();
        } catch(IOException e) {
            System.out.println("File doesn't exist");
        }
    }
}