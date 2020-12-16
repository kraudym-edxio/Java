/**
 * This is a class which is used to create different classes for books
 */

public class Book {

    //Private string variables
    private String name;
    private String author;

    //Private integer variables
    private int year;
    private int pages;

    /**
     * This is the default constructor
     */
    public Book() {

        name = " ";
        author = " ";
        year = 0;
        pages = 0;

    }

    /**
     * This is the second constructor. It will create an instance of
     * Book given its name as a mandatory value.
     * @param name The name of the book
     */
    public Book(String name) {

        this.name = name;
        author = " ";
        pages = 0;
        year = 0;

    }

    /**
     * This is the third constructor. It will create an instane of
     * Book given its name and author as mandatory values.
     * @param name The name of the book
     * @param author The author of the book
     */
    public Book(String name, String author) {

        this.name = name;
        this.author = author;
        pages = 0;
        year = 0;

    }

    /**
     * Accessor for book name
     * @return the name of the book
     */
    public String getName(){
        return this.name;
    }

    /**
     * Accessor for book's author
     * @return the author of the book
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Accessor for publication year
     * @return the book's year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Accessor for number of pages
     * @return the number of pages
     */
    public int getPages() {
        return this.pages;
    }

    /**
     * Sets the name of the book
     * @param name The name of the book
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the author of the book
     * @param author The author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the publication year
     * @param year The year of the book
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the number of pages
     * @param pages The number of pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

}