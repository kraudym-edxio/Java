import java.util.Scanner;

/**
 This class prints prime numbers.
 */
public class PrimePrinter {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter upper limit: ");

        int limit = in.nextInt();

        //Testing isPrime and printing all primes until upper limit
        System.out.printf("Prime numbers up to %d: ", limit);
        for (int a = 2; a <= limit; a++) {

            if (PrimeGenerator.isPrime(a)) {
                System.out.print(a + " ");
            }

        }

    }

}