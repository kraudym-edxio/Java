public class Tester {

    public static void main (String[] args) {

        Manager m1 = new Manager("Edxio", 19, "Male", 56342.76, 2013, 320.22);
        System.out.println(m1);

        Person p1 = new Person("John", 45, "Male");
        System.out.println(p1);

        Student s1 = new Student("Emily", 19, "Female", "Mathematics", 2023, Student.Level.undergraduate);
        System.out.println(s1);

        Employee e1 = new Employee("Sally", 23, "Female", 78231.23, 1999);
        System.out.println(e1);

    }

}