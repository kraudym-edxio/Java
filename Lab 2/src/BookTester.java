public class BookTester {

    public static void main (String[] args) {

        Book book_default = new Book();
        Book book1 = new Book("To Kill a Mockingbird");
        Book book2 = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell");

        System.out.printf("Actual name of book1: %s\n", book1.getName());
        System.out.println("Expected name of book1: To Kill a Mockingbird\n");

        book1.setAuthor("Edxio Kraudy Mora");
        book1.setPages(432);

        System.out.printf("Actual author of book1: %s\n", book1.getAuthor());
        System.out.println("Expected author of book1: Edxio Kraudy Mora\n");

        book2.setYear(1996);
        book2.setName("Theoretical Foundations of Computer Science");

        System.out.printf("Actual year of book2: %d\n", book2.getYear());
        System.out.println("Expected year of book2: 1996\n");

        System.out.printf("Actual name of book2: %s\n", book2.getName());
        System.out.println("Expected name of book2: Theoretical Foundations of Computer Science\n");

    }

}