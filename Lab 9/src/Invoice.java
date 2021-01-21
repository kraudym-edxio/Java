import java.util.ArrayList;

/**
 * Class is used to create an invoice and add items to each invoice object
 */
public class Invoice {

    private ArrayList<LineItem> itemsList;

    /**
     * This is the default constructor
     */
    public Invoice() {
        this.itemsList = new ArrayList<>();
    }

    /**
     * Adds an item to the list of type LineItem if in stock
     * @param product product to be added
     * @param quantity quantity of the product
     */
    public void addItem(Product product, int quantity) {

        if (product.isOutOfStock() || product.getQuantity() < quantity) {
            product.setOutOfStock(true);
        }

        else {
            this.itemsList.add(new LineItem(product, quantity));
        }

    }

    /**
     * Accessor for the list of items
     * @return the list of items
     */
    public ArrayList<LineItem> getItemsList() {
        return itemsList;
    }

    /**
     * Sets the list of items
     * @param itemsList list of items
     */
    public void setItemsList(ArrayList<LineItem> itemsList) {
        this.itemsList = itemsList;
    }

    /**
     * Overriding the toString method for Invoice class
     * @return new string representation
     */
    @Override
    public String toString() {
        return "Invoice{" + "itemsList = " + itemsList + '}';
    }

}