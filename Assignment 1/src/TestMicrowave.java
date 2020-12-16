public class TestMicrowave {

    public static void main (String[] args) {

        Microwave micro = new Microwave();

        micro.incTime(5);
        micro.setPower(Microwave.PowerLevel.High);

        System.out.printf("Actual cook time : %d\n", micro.getTime());
        System.out.println("Expected power level: 150\n");

        System.out.printf("Actual power level: %s\n", micro.getPower());
        System.out.println("Expected power level: High\n");

        micro.pressStart(); //Will display "Cooking for (time) seconds at level (power)."

        System.out.printf("Actual status: %s\n", micro.getStatus());
        System.out.println("Expected status: Started\n");

        micro.pressStop(); //Wil display "Cooking stopped."

        System.out.printf("Actual status: %s\n", micro.getStatus());
        System.out.println("Expected status: Stopped\n");

        micro.pressReset(); //Wil display "Cooking stopped."

        System.out.printf("Actual status: %s\n", micro.getStatus());
        System.out.println("Expected status: Reset\n");

        System.out.printf("Actual cook time : %d\n", micro.getTime());
        System.out.println("Expected power level: 0\n");

        System.out.printf("Actual power level: %s\n", micro.getPower());
        System.out.println("Expected power level: Low\n");

    }

}
