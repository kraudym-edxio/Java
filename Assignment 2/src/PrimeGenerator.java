import java.util.Enumeration;

/**
 This class generates all prime numbers.
 */

public class PrimeGenerator {

    private int current;

    public PrimeGenerator() {
        current = 1;
    }

    /**
     Calculates the next prime number.
     @return the next prime number
     */
    public int nextPrime() {

        while (true) {

            if (isPrime(current)) {
                return current;
            }

            else {
                current++;
            }

        }

    }

    /**
     Check if n is a prime number.
     @param n to check whether it is prime or not @return true if n is prime
     */
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int x = 2; x < n; x++) {

            if (n % x == 0) {
                return false;
            }

        }

        return true;

    }

}