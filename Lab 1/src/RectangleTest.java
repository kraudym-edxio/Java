import java.awt.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(10, 15, 20, 45);
        System.out.println("X: " + rect1.getX());
        System.out.println("Y: " + rect1.getY());

        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());

    }

}