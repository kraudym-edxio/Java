import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {

    public static void main (String[] args) {

        ArrayList<Integer> sequence = new ArrayList<Integer>();

        //Initializing base cases
        sequence.add(0);
        sequence.add(1);

        Scanner term = new Scanner(System.in);
        Scanner element = new Scanner(System.in);

        System.out.print("Enter a term number to print the first n Fibonacci numbers: ");
        int n = term.nextInt(); //User inputted value is set to variable n

        //Loop to next term to Fibonacci sequence
        for (int i = 2; i < n; i++) {
            sequence.add(sequence.get(i - 2) + sequence.get(i - 1));
        }

        //Enhanced for loop to print Fibonacci sequence
        for (Integer num: sequence) {
            System.out.print(num + "\t");
        }

        System.out.print("\nEnter a term number to determine its value in the sequence: ");
        int a = element.nextInt(); //User inputted value is set to variable a

        //Checking the validity of user input
        while (a >= n || a < 0) {
            System.out.print("Out of bounds for sequence generated, try again: ");
            a = element.nextInt();
        }

        //Printing the value of user inputted term
        System.out.printf("Term %d of the sequence is %d.\n", a, sequence.get(a));

    }

}