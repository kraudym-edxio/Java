import java.util.Scanner;

public class ComboLockTester {

    public static void main (String[] args) {

        ComboLock lock1 = new ComboLock(16, 25, 2);
        Scanner in = new Scanner(System.in);

        while (!lock1.open()) {

            System.out.print("First, how much would you like to turn right from 0: ");
            int input = in.nextInt();
            lock1.turnRight(input);

            System.out.printf("Second, how much would you like to turn left from %d: ", lock1.getLocation());
            input = in.nextInt();
            lock1.turnLeft(input);

            System.out.printf("Third, how much would you like to turn right from %d: ", lock1.getLocation());
            input = in.nextInt();
            lock1.turnRight(input);

            if (lock1.getX1() == 0 && lock1.getX2() == 0 && lock1.getX3() == 0) {
                break; //Exit the loop of prompts when user's combination is 0 0 0
            }

            if (lock1.open()) {
                System.out.println("\nLock was successfully opened!\n");
            }

            else {
                System.out.println("\nLock cannot open, try again!\n");
                lock1.reset();
            }

        }

    }

}