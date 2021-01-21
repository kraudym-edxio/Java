/**
 * This class is used to create LineItems using products and their quantities
 */
public class LineItem {

    private Product product;
    private int quantity;
    private double total;

    /**
     * This is the default constructor
     */
    public LineItem() {
        this.product = null;
        this.quantity = 0;
        this.total = 0.0;
    }

    /**
     * This is the second constructor
     * @param product the product
     * @param quantity the quantity of said product
     */
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.total = product.getPrice() * quantity;
    }

    /**
     * Accessor for the product
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Accessor for the quantity of product
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Accessor for the amount due
     * @return total to be paid
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets the product
     * @param product the product to be set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Sets the quantity of product
     * @param quantity product's quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Overriding the toString method
     * @return string representation of a LineItem
     */
    @Override
    public String toString() {
        return "LineItem{" + "product = " + product + ", quantity = " + quantity + ", total = " + total + '}';
    }

}