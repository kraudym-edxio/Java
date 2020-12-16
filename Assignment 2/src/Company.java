import java.util.ArrayList;

public class Company {

    private String companyName;
    private int startingYear;

    private ArrayList<Employee> employees;
    private ArrayList<Manager> managers;

    /**
     * This is the default constructor
     */
    public Company() {

        this.companyName = "";
        this.startingYear = 0;
        this.employees = new ArrayList<Employee>();
        this.managers = new ArrayList<Manager>();

    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getStartingYear() {
        return this.startingYear;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Manager> getManagers() {
        return this.managers;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

}