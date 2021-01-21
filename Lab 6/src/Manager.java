public class Manager extends Employee {

    private double bonusSalary;

    public Manager() {
        super();
        this.bonusSalary = 0;
    }

    public Manager(String name, int age, String gender, double salary, int hireDate, double bonusSalary) {
        super(name, age, gender, salary, hireDate);
        this.bonusSalary = bonusSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonusSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekly bonus = " + getBonusSalary();
    }

}