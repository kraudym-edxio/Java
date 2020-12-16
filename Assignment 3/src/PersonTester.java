import java.util.ArrayList;
import java.util.Scanner;

public class PersonTester {

    public static void main (String[] args) {

        ArrayList<Person> people = new ArrayList<Person>();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the names of ten people: ");
        for (int x = 0; x < 10; x++) {
            people.add(new Person(in.next()));
        }

        Person first = people.get(0);
        Person last = people.get(0);

        for (Person person : people) {

            if (person.compareTo(first) < 0) {
                first = person;
            }

            if (person.compareTo(last) > 0) {
                last = person;
            }

        }

        System.out.println("First person: " + first.getName());
        System.out.println("Last person: " + last.getName());

    }

}