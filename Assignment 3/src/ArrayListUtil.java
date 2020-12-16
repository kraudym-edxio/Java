import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtil {

    /**
     * Static method that reverses the elements of a generic ArrayList
     * @param list ArrayList to be reversed
     * @param <E> parameter type
     */
    public static <E> void reverseElements(ArrayList<E> list) {

        E element;

        for (int x = 0; x < list.size() / 2; x++) {
            element = list.get(x);
            list.set(x, list.get(list.size() - 1 - x));
            list.set(list.size() - 1 - x, element);
        }

    }

    /**
     * Static method that reverses the elements of a generic ArrayList without modifying original
     * @param list ArrayList to be reversed
     * @param <E> parameter type
     * @return reversed list
     */
    public static <E> ArrayList<E> reverse(ArrayList<E> list) {

        ArrayList<E> reversed = new ArrayList<>();

        for (int x = 0; x < list.size(); x++) {
            reversed.add(list.get(list.size() - 1 - x));
        }

        return  reversed;

    }

    /**
     * Main method to test static methods above
     * @param args input arguments
     */
    public static void main (String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(-23, -56, 77, 32, -1));
        System.out.println("List before reverseElements: " + integerList);
        reverseElements(integerList);
        System.out.println("List after reverseElements: " + integerList);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Everyone");
        strings.add("People");
        strings.add("Java");

        System.out.println("List before reverseElements: " + strings);
        System.out.println("List after reverseElements: " + reverse(strings));

    }

}