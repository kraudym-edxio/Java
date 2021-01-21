import java.util.ArrayList;
import java.util.Collections;

public class PairTester {

    public static void main (String[] args) {

        ArrayList< Pair<String, ArrayList<String>> > list = new ArrayList<>();
        ArrayList< Pair<String, ArrayList<String>> > list2 = new ArrayList<>();

        Pair<String, ArrayList<String>> pair1 = new Pair<String, ArrayList<String>>();

        pair1.setFirst("Smart");

        ArrayList<String> synonyms = new ArrayList<>();
        synonyms.add("Intelligent");
        synonyms.add("Clever");
        synonyms.add("Bright");

        Collections.sort(synonyms);
        pair1.setSecond(synonyms);

        list.add(pair1);
        list2.add(pair1);

        System.out.println("Actual pair1 first value: " + pair1.getFirst());
        System.out.println("Expected pair1 first value: Smart");

        System.out.println("\nActual pair1 second value: " + pair1.getSecond());
        System.out.println("Expected pair1 second value: [Bright, Clever, Intelligent]");

        System.out.println("\nActual list: " + list);
        System.out.println("Expected list: [Pair {First = Smart, Second = [Bright, Clever, Intelligent]}]");

        System.out.println("\nActual value for equality of list and list2: " + list.equals(list2));
        System.out.println("Expected value for equality of list and list2: true");

    }

}