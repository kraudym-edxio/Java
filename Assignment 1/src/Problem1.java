public class Problem1 {

    public static void main (String[] args) {

        int s_knot = 10;
        int v_knot = 8;
        int t = 3;
        int g = 4;

        double s = (s_knot * v_knot) - (0.5 * g * (Math.pow(t, 3)));

        int a = 5;
        int m1 = 7;
        int m2 = 4;
        int p = 9;
        double pi = 3.14159;

        double G = 0.75 * (pi * pi) * (Math.pow(a, 3) / (Math.pow(p, 0.5) * (m1 - m2)));

        System.out.println("Final results are: s = " + s + " and G = " + G);

    }

}
