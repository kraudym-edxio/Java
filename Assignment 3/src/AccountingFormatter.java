/**
 * Class which formats numbers in accounting format
 */
public class AccountingFormatter implements NumberFormatter {

    public String format(int n) {

        if (n < 0) {
            return String.format("(%d)", Math.abs(n));
        }

        else {
            return String.valueOf(n);
        }

    }

}