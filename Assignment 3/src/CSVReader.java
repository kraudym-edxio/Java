import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

    private ArrayList<ArrayList<String>> data ;

    /**
     * This is the default constructor
     * @param input CSV file to be read
     */
    public CSVReader(String input) {

        data = new ArrayList<ArrayList<String>>();

        try {

            String[] words;
            Scanner in = new Scanner(new File(input));

            //While the .csv file has more rows
            while (in.hasNextLine()) {

                words = in.nextLine().split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                ArrayList<String> rows = new ArrayList<>();

                //Each word will be added to the rows list
                for (String word : words) {
                    rows.add(word.trim());
                }

                //List of words in ArrayList rows is added to the data ArrayList
                data.add(rows);

            }

            in.close();

        }

        catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

    }

    /**
     * Accessor for the number of rows of a .csv file
     * @return number of rows
     */
    public int numberOfRows() {
        return data.size();
    }

    /**
     * Accessor for the number of fields in a row of a .csv file
     * @param row row to determine field count
     * @return field count for specified row
     */
    public int numberOfFields(int row) {
        return data.get(row).size();
    }

    /**
     * Accessor for the field in specified row and column
     * @param row row number
     * @param column column number
     * @return field within specified row and column numbers
     */
    public String field(int row, int column) {
        return data.get(row).get(column);
    }

}