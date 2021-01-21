/*

    Invoice <>----- LineItem <>----- Product <>----- Address

    Invoice class aggregates LineItem class
    LineItem class aggregates Product class
    Product class aggregates Address class

 */
public class InvoiceTester {

    public static void main (String[] args) {

        Address a1 = new Address(1001);
        Product p1 = new Product();

        p1.setAddress(a1);
        p1.setPrice(12.45);
        p1.setQuantity(16);

        System.out.println(p1);

        LineItem l1 = new LineItem(p1, 12);

        Invoice i1 = new Invoice();
        i1.addItem(p1, 4);

        System.out.println(i1);

    }

}