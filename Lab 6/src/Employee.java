public class Employee extends Person {

    private double salary;
    private int hireDate;

    public Employee() {
        super();
        this.salary = 0;
        this.hireDate = 0;
    }

    public Employee(String name, int age, String gender, double salary, int hireDate) {
        super(name, age, gender);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Annual salary = " + this.getSalary() + ", Hire date: " + this.getHireDate();
    }
}