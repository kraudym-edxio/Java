	/**
 * This is a class used to simulate the fundamental behaviors of a Person
 */

public class Person {

    //Private integer variables
    private int age;
    private int distance;

    //Private double variables
    private double walkingCapability = 30;

    //Private string variables
    private String name;

    //Private variable of type Person
    private Person friend;

    //Private boolean variables
    private boolean isHungry;
    private boolean isFull;
    private boolean isTired;
    private boolean isSleeping;
    private boolean isWalking;

    /**
     * This is the default constructor
     */
    public Person() {

        distance = 0;
        isHungry = false;
        isTired = false;
        isSleeping = false;

    }

    /**
     * This is the second constructor
     * @param name the name of the person
     * @param age the age of the person
     */
    public Person (String name, int age) {

        this();
        this.name = name;
        this.age = age;

    }

    /**
     * Accessor for the age of the person
     * @return the age of the person
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Sets the age of the person
     * @param age the age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Accessor for the name of the person
     * @return the name of the person
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the person
     * @param name the name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Determines if the person can talk a sentence based on their age
     * @return the ability to talk (true or false)
     */
    public boolean canTalk() {
        return age >= 2; //Returns true if person is at least two years old
    }

    /**
     * Determines if the person can eat based on their hunger
     * @param isHungry whether the person is hungry (true or false)
     * @return ability to eat (true or false)
     */
    public boolean canEat(boolean isHungry) {

        if (isHungry) {
            isFull = true;
            return true;
        }

        else {
            isFull = false;
            return false;
        }

    }

    /**
     * Accessor to check if the person is hungry
     * @return value of isHungry (true or false)
     */
    public boolean hungryCheck() {
        return this.isHungry;
    }

    /**
     * Changes the person's hungry status. Will become hungry if currently full
     */
    public void needFood() {

        if (isFull) {
            isHungry = true;
        }

    }

    /**
     * Determines if the person can awake based on if they're sleeping
     * @param isSleeping whether the person is sleeping (true or false)
     * @return ability to awake (true or false)
     */
    public boolean canAwake (boolean isSleeping) {
        return isSleeping; //If sleeping can awake, if not sleeping cannot awake
    }

    /**
     * Determines if the person can sleep based on if they're already sleeping
     * @param isSleeping whether the person is sleeping (true or false)
     * @return ability to sleep (true or false)
     */
    public boolean canSleep(boolean isSleeping) {

        if (!isSleeping) {

            distance = 0;
            isTired = false;
            isWalking = false;

            return true;

        }

        else {
            return false;
        }

    }

    /**
     * Accessor for checking value of isTired
     * @return the value of isTired (true or false)
     */
    public boolean tiredCheck() {
        return this.isTired;
    }

    /**
     * Simulates a person walking a particular distance
     * @param km number of kilometers covered
     */
    public void canWalk(int km) {

        this.distance += km; //Distance represents the total distance they've covered

        if (km > 4) { //If person walks more than 4km at a time, they become tired
            isTired = true;
            isWalking = false; //Can no longer walk after more than 4km at a time
        }

    }

    /**
     * Simulates the aging of a person and their reduced ability to walk every five years
     */
    public void canGrow() {

        age++;
        int yearsOver;

        if (age >= 55) {

            yearsOver = age - 55;

            while (yearsOver >= 5) {
                yearsOver -= 5;
                walkingCapability /= 2;
            }

        }

    }

    /**
     * Accessor for the walking capacity of a person
     * @return the walking capacity
     */
    public double getWalkingCapability() {
        return this.walkingCapability;
    }

    /**
     * Accessor for the friend of type Person
     * @return instance variable friend
     */
    public Person getFriend() {
        return this.friend;
    }

    /**
     * Changes/creates a new friend of type Person
     * @param name the name of the friend
     * @param age the age of the friend
     */
    public void changeFriend(String name, int age) {
        this.friend = new Person(name, age);
    }

}