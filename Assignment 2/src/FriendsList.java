import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FriendsList {

    //Declaration of instance variables
    private ArrayList<Person> friends = new ArrayList<Person>();

    /**
     * This is the default constructor
     */
    public FriendsList() {

    }

    /**
     * Acessor for list of friends
     * @return list of friends
     */
    public ArrayList<Person> getFriends() {
        return this.friends;
    }

    /**
     * Sets the list of friends
     * @param friends list of friends
     */
    public void setFriends(ArrayList<Person> friends) {
        this.friends = friends;
    }

    /**
     * Adds a friend to the list
     * @param friend object of the Person class
     */
    public void addFriend(Person friend) {
        friends.add(friend);
    }

    /**
     * Accessor for the size of the list
     * @return size of list
     */
    public int getSize() {
        return friends.size();
    }

    /**
     * Remove a friend from the list
     * @param cellNumber cell number of friend
     */
    public void removeByCell(String cellNumber) {

        Person x = null;
        for (Person person : friends) {

            if (person.getCellNumber().equals(cellNumber)) {
                x = person;
                break;
            }

        }

        if (x != null) {
            friends.remove(x);
        }

    }

    /**
     * Remove a friend from the list
     * @param firstName first name of friend
     */
    public void removeByFirstName(String firstName) {

        Person x = null;
        for (Person person : friends) {

            if (person.getFirstName().equals(firstName)) {
                x = person;
                break;
            }

        }

        if (x != null) {
            friends.remove(x);
        }

    }

    /**
     * Remove a friend from the list
     * @param firstName first name of friend
     * @param lastName last name of friend
     */
    public void removeFriend(String firstName, String lastName) {

        Person x = null;
        for (Person person : friends) {

            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                x = person;
                break;
            }

        }

        if (x != null) {
            friends.remove(x);
        }

    }

    /**
     * Accessor for list of friends who are born on a given month sorted by their day of birth
     * @param month birth month
     * @return list of friends born in the same month sorted by day
     */
    public ArrayList<Person> bornMonth (int month) {

        ArrayList<Person> sameMonthFriends = new ArrayList<Person>();
        for (Person person : friends) {

            if (person.getBirthMonth() == month) {
                sameMonthFriends.add(person);

            }

        }

        //Sorting sameMonthFriends by day
        sameMonthFriends.sort(new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getBirthDay() - p2.getBirthDay();
            }

        });

        return sameMonthFriends;

    }

    /**
     * Accessor for the list of friends who are born on a given day sorted by their last-names
     * @param day birth day
     * @return list of friends born on the same day sorted by lastName
     */
    public ArrayList<Person> bornDay (int day) {

        //Enhanced for loop to find every
        ArrayList<Person> sameDayFriends = new ArrayList<Person>();
        for (Person person : friends) {

            if (person.getBirthDay() == day) {
                sameDayFriends.add(person);

            }

        }

        //Sorting sameDayFriends by lastName
        sameDayFriends.sort(new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }

        });

        return sameDayFriends;

    }

    /**
     * Sorts the list of friends by lastName
     * @return list sorted by lastName
     */
    public ArrayList<Person> lastNameSort() {

        friends.sort(new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }

        });

        return friends;

    }

    /**
     * Accessor for the phone number of a friend
     * @param firstName first name of friend
     * @param lastName last name of friend
     * @return cellNumber of corresponding friend
     */
    public String getCellNumber(String firstName, String lastName) {

        for (Person person : friends) {

            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                return person.getCellNumber();
            }

        }

        return "No phone number found for: " + firstName + "" + lastName;

    }

}