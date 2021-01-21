/**
 * This class is used to create addresses
 */
public class Address {

    private int address;

    /**
     * This is the default constructor
     */
    public Address() {
        this.address = 0;
    }

    /**
     * This is the second constructor
     * @param address the address
     */
    public Address(int address) {
        this.address = address;
    }

    /**
     * Accessor for the address
     * @return the address
     */
    public int getAddress() {
        return address;
    }

    /**
     * Sets the address
     * @param address the address
     */
    public void setAddress(int address) {
        this.address = address;
    }

    /**
     * Overriding the toString method
     * @return string representation of Address
     */
    @Override
    public String toString() {
        return "Address{" + "address = " + address + '}';
    }
}