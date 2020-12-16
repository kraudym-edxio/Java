import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Problem3 {

    public static void main (String[] args) {

        Line2D myline = new Line2D.Double(3, 12, 17, 31);
        myline.setLine(3, 12, 19, 13);

        Ellipse2D myellipse = new Ellipse2D.Double(4, 13, 60 ,25);

        //For Line
        System.out.println("Line results test: \n");

        System.out.println("Expected X1: 3.0\t Actual X1: " + myline.getX1());
        System.out.println("Expected Y1: 12.0\t Actual Y1: " + myline.getY1());
        System.out.println("Expected X2: 19.0\t Actual X2: " + myline.getX2());
        System.out.println("Expected Y2: 13.0\t Actual Y2: " + myline.getY2());

        //For Ellipse
        System.out.println("\nEllipse results test: \n");

        System.out.println("Expected width: 60.0\t Actual width: " + myellipse.getWidth());
        System.out.println("Expected height: 25.0\t Actual height: " + myellipse.getHeight());
        System.out.println("Expected X: 4.0\t Actual X: " + myellipse.getX());
        System.out.println("Expected Y: 13.0\t Actual Y: " + myellipse.getY());

    }

}
