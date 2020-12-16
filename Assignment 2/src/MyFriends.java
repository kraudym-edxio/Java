import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyFriends {

    public static void main (String[] args) {

        //Object of FriendsList class
        FriendsList list1 = new FriendsList();

        //Objects of Person class
        Person p1 = new Person("Edxio", "Kraudy");
        Person p2 = new Person("John", "Smith", "226-787-1091", 7, 9);
        Person p3 = new Person("Jake", "Mason", "519-965-9807", 5, 9);
        Person p4 = new Person("Shane", "Benson", "226-345-5998", 7, 4);
        Person p5 = new Person("Bill", "Ted", "519-677-6777", 7, 9);
        Person p6 = new Person("Emily", "Hays", "519-787-6789", 2, 8);

        p1.setCellNumber("519-111-9090");
        p1.setBirthMonth(1);
        p1.setBirthDay(9);

        //Adding friends
        list1.addFriend(p1);
        list1.addFriend(p2);
        list1.addFriend(p3);
        list1.addFriend(p4);
        list1.addFriend(p5);
        list1.addFriend(p6);

        //Testing lastNameSort method
        ArrayList<Person> friends = list1.lastNameSort();
        System.out.println("Friends list: ");

        for (Person name: friends) {
            System.out.println(name);
        }

        System.out.println("\nActual size of friends list: " + list1.getSize());
        System.out.println("Expected size of friends list: 6\n");

        list1.removeFriend("Edxio", "Kraudy");
        list1.removeByCell("226-787-1091"); //Removes John by cellNumber

        //Testing bornMonth method (using July- also sorted by day)
        ArrayList<Person> julyFriends = list1.bornMonth(7);
        System.out.println("Friends born in July: ");

        for(Person name: julyFriends){
            System.out.println(name);
        }

        //Testing bornDay method (using 9- also sorted by lastName)
        ArrayList<Person> nineFriends = list1.bornDay(9);
        System.out.println("\nFriends born on the 9th: ");

        for(Person name: nineFriends){
            System.out.println(name);
        }

        //Testing getCellNumber method
        System.out.println("\nActual cellNumber of Emily Hays: " + list1.getCellNumber("Emily", "Hays"));
        System.out.println("Expected cellNumber of Emily Hays: 519-787-6789\n");

        FriendsList list2 = new FriendsList();

        list2.addFriend(p4);
        list2.addFriend(p5);
        list2.addFriend(p6);

        //Printing friends of list 2 FriendsList object
        System.out.println("Friends list (different object): ");
        ArrayList<Person> friends2 = list2.lastNameSort();

        for (Person name: friends2) {
            System.out.println(name);
        }

        list2.removeByFirstName("Shane");
        list2.getSize();

        System.out.println("\nAfter Shane is removed from the list: " + list2.getFriends());

    }

}
