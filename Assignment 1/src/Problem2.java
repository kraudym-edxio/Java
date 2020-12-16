public class Problem2 {

    public static void main (String[] args) {

        double x = -3.5;
        double y = 1.9;
        int n = 23;
        int m = 14;

        double part_a = (x - n) / (y + x + n * y);
        int part_b = n / (m + n % m);
        int part_c = (n % 2) + (m % 3);
        double part_d = (m + n) / 3.0;
        int part_e = (n - m) / 3;
        double part_f = (n - x) / 3;
        int part_g = 1 - (1 - (1 - n));
        int part_h = (m % 10) + (m - (n % 10));

        System.out.println(part_a); // -0.6294
        System.out.println(part_b); // 1
        System.out.println(part_c); // 3
        System.out.println(part_d); //12.3333
        System.out.println(part_e); //3
        System.out.println(part_f); //8.8333
        System.out.println(part_g); //-22
        System.out.println(part_h); //15

    }

}