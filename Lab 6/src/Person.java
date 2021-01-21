public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + getClass() + ", Age: " + age + ", Gender: " + gender;
    }

}