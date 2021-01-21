public class Activity3 {

    public static void main (String[] args) {

        Chicken chicken = new Chicken();
        Fish fish = new Fish();
        Meat meat = new Meat();

        System.out.println("How to eat " + chicken.howtoEat());
        System.out.println("How to eat " + fish.howtoEat());
        System.out.println("How to eat " + meat.howtoEat());

        Orange orange = new Orange();
        Apple apple = new Apple();
        Banana banana = new Banana();

        System.out.println("\nHow to eat " + orange.howtoEat());
        System.out.println("How to eat " + apple.howtoEat());
        System.out.println("How to eat " + banana.howtoEat());

    }

}