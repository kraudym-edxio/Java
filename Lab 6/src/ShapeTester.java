import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapeTester {

    public static void main (String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        while (true) {

            System.out.print("Enter one character (T, C, Q, O, or E): ");
            char option = in.next().charAt(0);

            switch (option) {

                case 'T': { //Triangle
                    double base = rand.nextInt(20) + 1;
                    double height = rand.nextInt(20) + 1;

                    Triangle triangle = new Triangle(base, height);
                    shapes.add(triangle);

                    continue;
                }

                case 'C': { //Circle
                    double radius = rand.nextInt(20) + 1;

                    Circle circle = new Circle(radius);
                    shapes.add(circle);

                    continue;
                }

                case 'Q': { //Square
                    double side = rand.nextInt(20) + 1;

                    Square square = new Square(side);
                    shapes.add(square);

                    continue;
                }

                case 'O': {
                    double horRadius = rand.nextInt(20) + 1;
                    double verRadius = rand.nextInt(20) + 1;

                    Oval oval = new Oval(horRadius, verRadius);
                    shapes.add(oval);

                    continue;
                }

                case 'E': { //Exit loop
                    break;
                }

            }

            break;

        }

        for (Shape shape : shapes) {
            System.out.printf("Shape: %s\t Area: %.2f\n", shape.getName(), shape.area());
        }

    }

}