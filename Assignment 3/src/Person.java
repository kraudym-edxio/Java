public class Person implements Comparable<Person> {

   private String name;

    /**
     * This is the default constructor
     */
    public Person() {
        this.name = "";
    }

    /**
     * This is the second constructor
     * @param name name of a person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Accessor for the name of a person
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of a person
     * @param name the person's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Overriding the compareTo method
     * @param p a Person
     * @return int value based on comparison
     */
    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }

}