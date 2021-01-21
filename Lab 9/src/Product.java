/**
 * This class is used to create products with basic values and properties
 */
public class Product {

    private double price;
    private int quantity;
    private Address address;
    private boolean outOfStock;

    /**
     * This is the default constructor
     */
    public Product() {
        this.quantity = 0;
        this.price = 0;
    }

    /**
     * This is the second constructor
     * @param address address of product
     * @param quantity quantity of product
     * @param price price of product
     */
    public Product(Address address, int quantity, double price) {
        this.address = new Address();
        this.quantity = quantity;
        this.price = price;

        this.outOfStock = this.quantity <= 0;

    }

    /**
     * Accessor for the price of a product
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Accessor for the quantity of a product
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Accessor for outOfStock value
     * @return true or false
     */
    public boolean isOutOfStock() {
        return outOfStock;
    }

    /**
     * Accessor for the product's address
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the price of a product
     * @param price of product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the quantity of a product
     * @param quantity of product
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets the true or false value of outOfStock
     * @param outOfStock true or false value
     */
    public void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    /**
     * Sets the address of a product
     * @param address the address of the product
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Overriding the toString method
     * @return string representation of a Product
     */
    @Override
    public String toString() {
        return "Product{" + "price = " + price + ", quantity = " + quantity + ", address = " + address + ", outOfStock = " + outOfStock + '}';
    }

}