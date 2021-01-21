/**
 * This is a class which is used to create different classes for cars
 */

public class Car {

    //Private string variables
    private String make;
    private String model;

    //Private integer variables
    private int year;
    private int speed;
    private int maxSpeed;

    //Private double variables
    private double price;

    //Private boolean variables
    private boolean isOn;
    private boolean isMoving;

    //Private TransmissionType variable (from enum)
    private TransmissionType transmission;

    /**
     * This is the default constructor
     */
    public Car() {

        speed = 0;
        transmission = TransmissionType.Automatic;
        maxSpeed = 150;

    }

    /**
     * This is the second constructor
     * @param make Make of the car
     * @param model Model of the car
     */
    public Car (String make, String model) {

        this();
        this.make = make;
        this.model = model;

    }

    /**
     * This is the third constructor
     * @param make Make of the car
     * @param model Model of the car
     * @param year Year of the car
     * @param price Price of the car
     */
    public Car (String make, String model, int year, double price) {

        this(make, model);
        this.year = year;
        this.price = price;

    }

    /**
     Accessor for the max speed of the car
     * @return the max speed of the car
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum speed for the car
     * @param maxSpeed the maximum speed of the car
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Accessor for the transmission type of the car
     * @return the transmission type
     */
    public TransmissionType getTransmission() {
        return this.transmission;
    }

    /**
     * Sets the transmission type of the car
     * @param transmission the transmission type of the car
     */
    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    /**
     * Accessor for the price of the car
     * @return the price of the car
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the price of the car
     * @param price the price of the car
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Accessor for the make of the car
     * @return the make of the car
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Sets the make of the car
     * @param make the of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Accessor for the model of the car
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car
     * @param model the model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Accessor for the year of the car
     * @return the year of the car
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of the car
     * @param year the year of the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Accessor for the speed of the car
     * @return the speed of the car
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the car
     * @param speed the speed of the car
     */
    public void setSpeed(int speed) {

        if (speed <= maxSpeed) {
            this.speed = speed;
        }

    }

    /**
     * Accessor for determining if the car is moving
     * @return True or false based on whether the car is moving
     */
    public boolean isMoving() {
        return this.isMoving;
    }

    /**
     * Sets the movement of the car to either true or false
     * @param moving the movement of the car (True or False)
     */
    public void setMoving(boolean moving) {
        this.isMoving = moving;
    }

    /**
     * Accessor for determining if the cat is on
     * @return True or false based on whether the car is on
     */
    public boolean isOn() {
        return this.isOn;
    }

    /**
     * Sets the boolean value for isOn
     * @param isOn whether the car is on (True or False)
     */
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * Sets the increase of speed due to acceleration
     * @param inc the increase of speed due to acceleration
     */
    public void accelerate(int inc) {
        if (inc + speed <= maxSpeed) {
            this.speed += inc;
        }
    }

    /**
     * Sets the decrease of speed due to deceleration
     * @param dec the decrease of speed due to deceleration
     */
    public void decelerate(int dec) {
        this.speed -= dec;
    }

    //Enum of transmission types
    enum TransmissionType {
        Manual, Automatic
    }

    public String toString() {
        return "Car: {" + "make = " + make + ", model = " + model + "}";
    }

}