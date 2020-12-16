public class TestPerson {

    public static void main (String[] args) {

        Person person1 = new Person("Edxio", 19);

        //Can talk if older than two years of age
        System.out.printf("Actual ability to talk: %b\n", person1.canTalk());
        System.out.println("Expected ability to talk: true\n");

        //Can sleep if not currently sleeping
        System.out.printf("Actual ability to sleep: %b\n", person1.canSleep(false));
        System.out.println("Expected ability to sleep: true\n");

        //Cannot sleep if currently sleeping
        System.out.printf("Actual ability to sleep: %b\n", person1.canSleep(true));
        System.out.println("Expected ability to sleep: false\n");

        //Can awake from sleep if currently sleeping
        System.out.printf("Actual ability to awake: %b\n", person1.canAwake(true));
        System.out.println("Expected ability to awake: true\n");

        //Cannot eat if not hungry
        System.out.printf("Actual ability to eat: %b\n", person1.canEat(false));
        System.out.println("Expected ability to eat: false\n");

        //Can eat if hungry
        System.out.printf("Actual ability to eat: %b\n", person1.canEat(true));
        System.out.println("Expected ability to eat: true\n");

        person1.needFood(); //Person will grow hungry after they are full
        System.out.printf("Actual value of isHungry: %b\n", person1.hungryCheck());
        System.out.println("Expected value isHungry: true\n");

        person1.canWalk(12); //Person has walked more than 4km at a time, they should now be tired
        System.out.printf("Actual value of isTired: %b\n", person1.tiredCheck());
        System.out.println("Expected value isTired: true\n");

        person1.changeFriend("Paulo", 20);
        System.out.println("Actual name and age of friend: " + person1.getFriend().getName());
        System.out.println("Expected name and age of friend: Paulo\n");

        Person person2 = new Person("John", 70);
        person2.canGrow();

        System.out.printf("Actual walking capacity of person2: %.2f\n", person2.getWalkingCapability());
        System.out.println("Expected walking capacity of person2: 3.75\n");

        System.out.printf("Actual age of person2: %d\n", person2.getAge());
        System.out.println("Expected age of person2: 71\n");

    }

}