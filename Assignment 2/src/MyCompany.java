import java.util.ArrayList;

public class MyCompany {

    public static void main (String[] args) {

        //Creating a Company object
        Company company1 = new Company();

        company1.setCompanyName("Fluid Dynamics");
        company1.setStartingYear(1987);

        //Creating Employee objects
        Employee emp1= new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.setFirstName("Edxio");
        emp1.setHireYear(2000);
        emp1.setVacationDaysUsed(6);

        emp2.setFirstName("Josh");
        emp2.setLastName("Tucker");
        emp2.setAnnualSalary(56900);
        emp2.setGetVacationDaysLeft(13);

        emp3.setFirstName("Hayley");
        emp3.setCellNumber("226-989-0009");
        emp3.setBirthMonth(10);

        ArrayList<Employee> empList1 = new ArrayList<Employee>();
        empList1.add(emp1);
        empList1.add(emp2);
        empList1.add(emp3);

        //Creating Manager objects
        Manager man1 = new Manager();
        Manager man2 = new Manager();
        Manager man3 = new Manager();

        man1.setFirstName("Fred");
        man1.setMonthlyBonus(1200);
        man1.setHireYear(1980);

        man2.setCellNumber("519-543-7676");
        man2.setAnnualSalary(12540.76);
        man2.setFirstName("Donald");

        man3.setFirstName("Lisa");
        man3.setVacationDaysUsed(12);
        man3.setGetVacationDaysLeft(13);

        ArrayList<Manager> manList1 = new ArrayList<Manager>();
        manList1.add(man1);
        manList1.add(man2);
        manList1.add(man3);

        company1.setEmployees(empList1);
        company1.setManagers(manList1);

        System.out.println("Actual employees of company1: " + company1.getEmployees());
        System.out.println("Expected employees of company1: [Name: Edxio , Birthday: 0/0, Cell number: , Name: Josh Tucker, Birthday: 0/0, Cell number: , Name: Hayley , Birthday: 10/0, Cell number: 226-989-0009] ");

        System.out.println("\nActual managers of company1: " + company1.getManagers());
        System.out.println("Expected managers of company1: [Name: Fred , Birthday: 0/0, Cell number: , Name: Donald , Birthday: 0/0, Cell number: 519-543-7676, Name: Lisa , Birthday: 0/0, Cell number: ]");

        System.out.println("\nActual vacation days used of emp1: " + emp1.getVacationDaysUsed());
        System.out.println("Expected vacation days used of emp1: 6");

        System.out.println("\nActual annual salary of man2: " + man2.getAnnualSalary());
        System.out.println("Expected annual salary of man2: 12540.76");

    }

}