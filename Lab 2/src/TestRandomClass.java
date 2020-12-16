import java.util.Random;

public class TestRandomClass {

    public static void main (String[] args) {

        Random rand = new Random(); //Instance of the Random class

        System.out.println("Printing five random integers: ");
        rand.ints(5).forEach(System.out::println);

        System.out.println("\nPrinting five random floating point (double) numbers: ");
        rand.doubles(5).forEach(System.out::println);

        System.out.println("\nPrinting five random integers (10 <= rand <= 20): ");
        rand.ints(5, 10, 21).forEach(System.out::println);

        System.out.println("\nPrinting five random floating point (double) numbers (1 <= rand < 10): ");
        rand.doubles(5, 1, 10).forEach(System.out::println);

        System.out.println("\nPrinting five random even integers (10 <= rand <= 100): ");
        int count = 0;
        while (count < 5) {

            int random = (rand.nextInt(91) + 10);

            //Checking if integer is even
            if (random % 2 == 0) {
                System.out.println(random);
                count++;
            }

        }

        //Simulating a coin toss
        System.out.println("\nCoin toss simulation: ");
        for (int x = 0; x < 5; x++) {

            int toss = rand.nextInt(2);

            if (toss == 0) {
                System.out.println("Head");
            }

            else {
                System.out.println("Tail");
            }

        }

    }

}