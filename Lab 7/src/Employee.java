public class Employee implements Payable {

    private String name;
    private int age;
    private double hourlyRate;
    private int workingHours;

    public Employee() {
        this.name = "";
        this.age = 0;
        this.hourlyRate = 0;
        this.workingHours = 0;
    }

    public Employee(String name, int age, double hourlyRate, int workingHours) {
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getPaymentAmount() {
        return workingHours * hourlyRate;
    }

}