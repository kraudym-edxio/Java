/**
 * Class which formats numbers in base(x) format
 */
public class BaseFormatter implements NumberFormatter {

    private int base;

    public BaseFormatter(int base) {
        this.base = base;
    }

    public String format(int n) {
        return Integer.toString(n, base);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

}