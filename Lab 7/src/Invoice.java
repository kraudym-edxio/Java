public class Invoice implements Payable {

    private int numberOfProduct;
    private double unitPrice;

    public Invoice() {
        this.numberOfProduct = 0;
        this.unitPrice = 0;
    }

    public Invoice(int numberOfProduct, double unitPrice) {
        this.numberOfProduct = numberOfProduct;
        this.unitPrice = unitPrice;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getPaymentAmount() {
        return numberOfProduct * unitPrice * 1.13;
    }

}