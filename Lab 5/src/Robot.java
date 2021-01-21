import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Robot {

    private Point location;
    private int direction;

    private ArrayList<String> history = new ArrayList<String>();

    /**
     * This is the default constructor
     * @param location where the robot is initially located (x, y)
     * @param direction 0 for North, 1 for East, 2 for South, and 3 for West
     */
    public Robot (Point location, int direction) {
        this.location = location;
        this.direction = direction;
        history.add(String.format("(%d, %d), %s\n", location.x, location.y, getDirection()));
    }

    public void turnLeft() {

        if (direction == 0) {
            this.direction = 3;
        }

        else {
            this.direction -= 1;
        }

        history.add(String.format("(%d, %d), %s\n", location.x, location.y, getDirection()));

    }

    public void turnRight() {

        if (direction == 3) {
            this.direction = 0;
        }

        else {
            this.direction += 1;
        }

        history.add(String.format("(%d, %d), %s\n", location.x, location.y, getDirection()));

    }

    public void move() {

        switch (direction) {

            case 0 -> location.translate(0, -1);
            case 1 -> location.translate(1, 0);
            case 2 -> location.translate(0, 1);
            case 3 -> location.translate(-1, 0);

        }

        history.add(String.format("(%d, %d), %s\n", location.x, location.y, getDirection()));

    }

    public Point getLocation() {
        return this.location;
    }

    public String getDirection() {

        String c = "N";

        switch (direction) {

            case 0:
                break;

            case 1:
                c = "E";
                break;

            case 2:
                c = "S";
                break;

            case 3:
                c = "W";
                break;

        }

        return c;

    }

    public String getHistory() {
        return history.toString().replace("[", "  ").replace("]", "");
    }

}