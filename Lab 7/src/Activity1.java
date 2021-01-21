public class Activity1 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Edxio", 19, 16.00, 40);
        Invoice i1 = new Invoice(132, 0.84);

        System.out.printf("Amount to be paid by e1: %.2f\n", e1.getPaymentAmount());
        System.out.printf("Amount to be paid by i1: %.2f\n", i1.getPaymentAmount());

    }

}