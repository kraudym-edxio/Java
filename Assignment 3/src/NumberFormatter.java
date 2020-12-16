/**
 * Interface for formatting numbers accordingly
 */
public interface NumberFormatter {

    /**
     * Method to be overwritten
     * @param n number to be formatted
     * @return String interpretation of number
     */
    String format(int n);

}