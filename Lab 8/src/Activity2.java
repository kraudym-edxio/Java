import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity2 {

    public static void main (String[] args) throws FileNotFoundException {

        ArrayList<Double> list = new ArrayList<Double>();

        try {

            File inputFile = new File(args[0]);
            Scanner in = new Scanner(inputFile);

            File otherFile = new File(args[1]);

            if (in.next().equals("Double")) { //Checks the data type of the file information

                while (in.hasNextLine()) {

                    //Reading the double values from file and storing them in the list
                    if (in.hasNextDouble()) {
                        double value = in.nextDouble();
                        list.add(value);
                    }

                    else if (in.hasNext()) {
                        in.next();
                    }

                }

            }

            if (args[2].equals("ascending")) {
                Collections.sort(list);
            }

            else {
                list.sort(Collections.reverseOrder());
            }

            PrintWriter out = new PrintWriter(otherFile);
            out.println("Double, " + list.size() + "\n" + list);

            in.close();
            out.close();

        }

        catch (IOException | InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }

    }

}