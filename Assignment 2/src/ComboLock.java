public class ComboLock {

    //Declaration of instance variables
    private int secret1, secret2, secret3;
    private int x1, x2, x3;
    private int location;
    private int counter;

    /**
     * This is the default constructor
     * @param secret1 unlock number from first turning right
     * @param secret2 unlock number from second turning left
     * @param secret3 unlock number from third turing right
     */
    public ComboLock(int secret1, int secret2, int secret3) {

        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;

    }

    /**
     * Resets the current location of the dial and its turning values
     */
    public void reset() {

        this.location = 0;
        this.counter = 0;
        this.x1 = 0;
        this.x2 = 0;
        this.x3 = 0;

    }

    /**
     * Simulates turning the dial to the right
     * @param ticks number of ticks right
     */
    public void turnRight(int ticks) {

        int temp = this.location + ticks;

        if (temp >= 40) {
            temp -=40;
        }

        this.location = temp;

        if (counter == 0) {
            x1 = location;
        }

        if (counter == 2) {
            x3 = location;
        }

        counter++;

        if (counter == 3) {
            counter = 0;
        }

    }

    /**
     * Simulates turning the dial to the left
     * @param ticks number of ticks left
     */
    public void turnLeft(int ticks) {

        int temp = this.location - ticks;

        if (temp < 0) {
            temp += 40;
        }

        this.location = temp;

        if (location == 0) {
            counter = 0;
        }

        if (counter == 1) {
            x2 = location;
            counter++;
        }

    }

    /**
     * Checks to see if lock can successfully open
     * @return true or false (depending on whether lock can open)
     */
    public boolean open() {
        return x1 == secret1 && x2 == secret2 && x3 == secret3;
    }

    public int getLocation() {
        return this.location;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getX3() {
        return this.x3;
    }
}