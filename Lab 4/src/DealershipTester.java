public class DealershipTester {

    public static void main (String[] args) {

        Car car1 = new Car("Ford", "EcoSport");
        Car car2 = new Car("Honda", "Civic", 2016, 37000);
        Car car3 = new Car("Toyota", "Camry");

        Dealership dealership1 = new Dealership("Rose City Sales", "Windsor");
        Dealership dealership2 = new Dealership("Pinnacle Purchases", "Toronto");

        dealership1.setLocation("Harrow");
        System.out.printf("Actual location of dealership1: %s\n", dealership1.getLocation());
        System.out.println("Expected location of dealership1: Harrow\n");

        System.out.printf("Actual name of dealership2: %s\n", dealership2.getName());
        System.out.println("Expected name of dealership2: Pinnacle Purchases\n");

        //Adding managers and employees to dealership1
        dealership1.addEmployee("Bill");
        dealership1.addEmployee("Hudson");
        dealership1.addEmployee("Dana");
        dealership1.addManager("Atlas");

        //Adding managers and employees to dealership2
        dealership2.addManager("Cindy");
        dealership2.addManager("Tony");
        dealership2.addEmployee("Steven");
        dealership2.addManager("Ross");

        System.out.println("Actual employees of dealership1: " + dealership1.getEmployees());
        System.out.println("Expected employees of dealership1: [Bill, Hudson, Dana]\n");
        System.out.println("Actual managers of dealership1: " + dealership1.getManagers());
        System.out.println("Expected managers of dealership1: [Atlas]\n");

        System.out.println("Actual employees of dealership2: " + dealership2.getEmployees());
        System.out.println("Expected employees of dealership2: [Steven]\n");
        System.out.println("Actual managers of dealership2: " + dealership2.getManagers());
        System.out.println("Expected managers of dealership2: [Cindy, Tony, Ross]\n");

        //Adding two cars to dealership1
        dealership1.addCar(car3);
        dealership1.addCar(car1);

        //Adding three cars to dealership2
        dealership2.addCar(car3);
        dealership2.addCar(car2);
        dealership2.addCar(car1);

        System.out.println("Actual list of cars for dealership1: " + dealership1.getCars());
        System.out.println("Expected list of cars for dealership1: [Car: {make = Toyota, model = Camry}, Car: {make = Ford, model = EcoSport}]\n");
        System.out.println("Actual list of cars for dealership2: " + dealership2.getCars());
        System.out.println("Expected list of cars for dealership2: [Car: {make = Toyota, model = Camry}, Car: {make = Honda, model = Civic}, Car: {make = Ford, model = EcoSport}]");

    }

}