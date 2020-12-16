import java.util.ArrayList;

public class Manager extends Employee {

    //Declaration of instance variables
    private double monthlyBonus;
    private ArrayList<Employee> employees;

    /**
     * This is the default constructor
     */
    public Manager() {

        super(); //Calling the no-argument constructor from Employee

        monthlyBonus = 0;
        this.employees = new ArrayList<Employee>();

    }

    /**
     * Accessor for the monthy bonus value
     * @return monthly bonus
     */
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    /**
     * Sets the monthly bonus value
     * @param monthlyBonus monthly bonus
     */
    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    /**
     * Accessor for the list of employees
     * @return list of employees
     */
    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    /**
     * Sets the list of employees
     * @param employees list of employees
     */
    public void setEmployees (ArrayList<Employee> employees) {
        this.employees = employees;
    }

    /**
     * Adds an employee to the list
     * @param employee employee
     */
    public void addEmployee (Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee from the list
     * @param employee employee
     */
    public void removeEmployee (Employee employee) {
        employees.remove(employee);
    }

}