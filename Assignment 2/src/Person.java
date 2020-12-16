public class Person {

    private String firstName;
    private String lastName;
    private String cellNumber;
    private int birthMonth;
    private int birthDay;

    public Person () {
        this.firstName = "";
        this.lastName = "";
        this.cellNumber = "";
        this.birthMonth = 0;
        this.birthDay = 0;
    }

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person (String firstName, String lastName, String cellNumber, int birthMonth, int birthDay) {
        this(firstName, lastName);
        this.cellNumber = cellNumber;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Birthday: " + getBirthMonth() + "/" + getBirthDay() + ", Cell number: " +
                getCellNumber();
    }

}
