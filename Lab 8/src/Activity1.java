import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Activity1 {

    public static void main (String[] args) throws FileNotFoundException {

        File inputFile = new File("hello.txt");

        PrintWriter out = new PrintWriter(inputFile);

        out.print("Hello, World!");
        out.close();

        Scanner in = new Scanner(inputFile);

        String line = in.nextLine();
        System.out.println(line);

        in.close();

    }

}