public class Employee extends Person {

    //Declaration of instance variables
    private int hireYear;
    private double annualSalary;
    private int vacationDaysUsed;
    private int getVacationDaysLeft;

    /**
     * This is the default constructor
     */
    public Employee() {

        super(); //Calling the no-argument constructor from Person

        this.annualSalary = 0;
        this.hireYear = 0;
        this.vacationDaysUsed = 0;
        this.getVacationDaysLeft = 0;

    }

    /**
     *Accessor for hire year
     * @return hire year
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * Accessor for annual salary
     * @return annual salary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Accessor for vacation days left
     * @return vacation days left
     */
    public int getGetVacationDaysLeft() {
        return getVacationDaysLeft;
    }

    /**
     * Accessor for vacation days used
     * @return vacation days used
     */
    public int getVacationDaysUsed() {
        return vacationDaysUsed;
    }

    /**
     * Sets the hire year
     * @param hireYear hire year
     */
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    /**
     * Sets the annual salary
     * @param annualSalary annual salary
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * Sets the vacation days left
     * @param getVacationDaysLeft vacation days left
     */
    public void setGetVacationDaysLeft(int getVacationDaysLeft) {
        this.getVacationDaysLeft = getVacationDaysLeft;
    }

    /**
     * Sets the vacation days used
     * @param vacationDaysUsed vacation days used
     */
    public void setVacationDaysUsed(int vacationDaysUsed) {
        this.vacationDaysUsed = vacationDaysUsed;
    }

}