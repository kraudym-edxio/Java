import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FormatTester {

    public static void main (String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>();

        File inputFile = new File("Numbers.txt");
        Scanner in = new Scanner(inputFile);

        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }

        System.out.println("Numbers from read file are: " + list);

        BaseFormatter bform = new BaseFormatter(8);
        AccountingFormatter aform = new AccountingFormatter();
        DefaultFormatter dform = new DefaultFormatter();
        DecimalSeparatorFormatter sform = new DecimalSeparatorFormatter();

        PrintWriter out = new PrintWriter("NumbersFormatted.txt");

        out.print("Default Format: ");
        for (Integer num : list) {
            out.printf("%s   ", dform.format(num));
        }

        out.print("\nDecimal Format: ");
        for (Integer num : list) {
            out.printf("%s   ", sform.format(num));
        }

        out.print("\nAccounting Format: ");
        for (Integer num : list) {
            out.printf("%s   ", aform.format(num));
        }

        out.printf("\nBase %d Format: ", bform.getBase());
        for (Integer num : list) {
            out.printf("%s   ", bform.format(num));
        }

        bform.setBase(2);

        out.printf("\nBase %d Format: ", bform.getBase());
        for (Integer num : list) {
            out.printf("%s   ", bform.format(num));
        }

        in.close();
        out.close();

    }

}