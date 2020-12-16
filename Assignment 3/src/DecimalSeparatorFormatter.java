/**
 * Class which formats numbers in decimal (, ) format
 */
public class DecimalSeparatorFormatter implements NumberFormatter {

    public String format(int n) {
        return String.format("%,d", n);
    }

}