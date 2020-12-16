public class StringTest {

    public static void main (String[] args) {

        String str = "edxio kraudy";
        System.out.println(str);
        System.out.println(str.length());

        //First and last name will always be split into two parts
        String[] parts = str.split(" ", 2);

        String firstName = parts[0];
        String lastName = parts[1];

        //Displaying str2 after an alteration
        String str2 = lastName + ", " + firstName;
        System.out.println(str2);

        //The last letter of the lastName will always be char at index (length of the string minus one)
        System.out.println(firstName.indexOf(lastName.charAt(lastName.length() - 1)));

        //The first letter of the lastName will always be char at index (0)
        System.out.println(firstName.lastIndexOf(lastName.charAt(0)));

        /*
          The first letter of the firstName and the first letter of the lastName, i.e. index 0,
          will always be the characters to be capitalized. This is why we can do the following:
         */
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName + " " + lastName);

    }

}
