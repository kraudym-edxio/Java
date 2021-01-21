import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * The purpose of this class is to create dealerships with some profile information
 * and store information of all its cars
 */

public class Dealership {

    //Private string variables
    private String name;
    private String location;

    //Private array lists
    private ArrayList<String> employees = new ArrayList<>();
    private ArrayList<String> managers = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();

    /**
     * This is the default constructor
     */
    public Dealership() {

    }

    /**
     * This is the second constructor
     * @param name the name of the dealership
     * @param location the location of the dealership
     */
    public Dealership(String name, String location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Accessor for the name of the dealership
     * @return dealership name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the dealership
     * @param name dealership name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor for the location of the dealership
     * @return the dealership location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the dealership
     * @param location dealership location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Accessor for list of employees
     * @return list of employees
     */
    public ArrayList<String> getEmployees() {
        return employees;
    }

    /**
     * Sets the list of employees of the dealership
     * @param employees a list of employees
     */
    public void setEmployees(ArrayList<String> employees) {
        this.employees = employees;
    }

    /**
     * Adds an employee to the list
     * @param employee name of employee
     */
    public void addEmployee(String employee) {
        this.employees.add(employee);
    }

    /**
     * Accessor for the list of managers
     * @return list of managers
     */
    public ArrayList<String> getManagers() {
        return managers;
    }

    /**
     * Sets the list of managers of the dealership
     * @param managers list of managers
     */
    public void setManagers(ArrayList<String> managers) {
        this.managers = managers;
    }

    /**
     * Adds a manager to the list
     * @param manager name of the manager
     */
    public void addManager(String manager) {
        this.managers.add(manager);
    }

    /**
     * Accessor for the list of the cars
     * @return list of cars
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * Sets the list of cars of the dealership
     * @param cars list of cars
     */
    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    /**
     * Adds a car to the list
     * @param addition car to be added
     */
    public void addCar(Car addition) {
        this.cars.add(addition);
    }

}