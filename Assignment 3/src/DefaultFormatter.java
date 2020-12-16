/**
 * Class which formats numbers in default format
 */
public class DefaultFormatter implements NumberFormatter {

    public String format(int n) {
        return String.valueOf(n);
    }

}