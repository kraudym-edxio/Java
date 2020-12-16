import java.util.LinkedList;

/**
 This class supplies a utility method to reverse the entries in a linked list.
 */
public class ListUtil {

    /**
     * Reverses the elements in a linked list
     * @param strings strings in the linked list to reverse
     */
    public static void reverse(LinkedList<String> strings) {

        String str;

        for (int x = 0; x < strings.size() / 2; x++) {
            str = strings.get(x);
            strings.set(x, strings.get(strings.size() - 1 - x));
            strings.set(strings.size() - 1 - x, str);
        }

    }

}