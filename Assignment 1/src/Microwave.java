/**
 * The purpose of this class is to simulate a microwave and its basic functionality
 */

public class Microwave {

    //Declaration of instance variables
    private PowerLevel power;
    private CurrentStatus status;

    private int time;

    /**
     * This is the default constructor
     */
    public Microwave() {

        time = 0;
        power = PowerLevel.Low;
        status = CurrentStatus.Stopped;

    }

    /**
     * Accessor for the cooking time of the microwave
     * @return the cook time
     */
    public int getTime() {
        return this.time;
    }

    /**
     * Increases cook time by 30 seconds per button press
     * @param timesPressed number of times button is pressed
     */
    public void incTime(int timesPressed) {
        this.time += (30 * timesPressed);
    }

    /**
     * Accessor for the power level of the microwave
     * @return the power level
     */
    public PowerLevel getPower() {
        return this.power;
    }

    /**
     * Sets the level of power for microwave cook
     * @param power power level of cook
     */
    public void setPower(PowerLevel power) {
        this.power = power;
    }

    /**
     * Accessor for the current status of the microwave
     * @return the status of the microwave
     */
    public CurrentStatus getStatus() {
        return this.status;
    }

    /**
     *Stops the microwave and changes its status to "Stopped"
     */
    public void pressStop() {

        status = CurrentStatus.Stopped;
        System.out.println("Cooking stopped.");

    }

    /**
     * Resets the microwave and changes its status to "Reset"
     */
    public void pressReset() {

        time = 0;
        power = PowerLevel.Low;
        status = CurrentStatus.Reset;

        System.out.println("Microwave has been reset to initial state.");

    }

    /**
     * Starts the microwave and changes its status to "Started"
     */
    public void pressStart() {

        status = CurrentStatus.Started;
        System.out.printf("Cooking for %d seconds at level %s.\n", time, power);

    }

    //Enumeration for types of power levels
    enum PowerLevel {
        Low, Medium, High
    }

    //Enumeration for microwave statuses
    enum CurrentStatus {
        Stopped, Started, Reset;
    }

}
