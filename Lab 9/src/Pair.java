/**
 * This is a generic class used to create Pairs
 * @param <T> first
 * @param <S> second
 */

public class Pair<T, S> {

    private T first;
    private S second;

    /**
     * This is the default constructor
     */
    public Pair() {

    }

    /**
     * This is the second constructor
     * @param first first parameter of type T
     * @param second second parameter of type S
     */
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Accessor for the first type
     * @return the first type
     */
    public T getFirst() {
        return first;
    }

    /**
     * Accessor for the second type
     * @return the second type
     */
    public S getSecond() {
        return second;
    }

    /**
     * Sets the first
     * @param first first
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * Sets the second
     * @param second second
     */
    public void setSecond(S second) {
        this.second = second;
    }

    /**
     * Overriding the toString method
     * @return string representation of a Pair
     */
    @Override
    public String toString() {
        return "Pair {" + "First = " + first + ", Second = " + second + '}';
    }

    /**
     * Overriding the equals method
     * @param o variable of type Object
     * @return boolean value based on equality
     */
    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;
        return first.equals(pair.first) && second.equals(pair.second);

    }

}