import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Class is used to store keys (first letters) and words beginning with said first letter
 */
public class FirstLetterMap {

    public static void main (String[] args) throws FileNotFoundException {

        try {

            Scanner in = new Scanner(new File("test2.txt"));
            in.useDelimiter("\\W+"); //Delimiter is used to ignore punctuation marks

            Map<Character, Set<String>> letterMap = new TreeMap<>();

            while (in.hasNext()) {
                String word = in.next().toLowerCase(); //Store word which has been read into a String variable
                char firstLetter = word.charAt(0); //Store the first letter of said word

               //Test to see if the map contains words beginning with firstLetter
                if (!letterMap.containsKey(firstLetter)) {
                    letterMap.put(firstLetter, new TreeSet<String>());
                }

                letterMap.get(firstLetter).add(word);

            }

            //Loop through displaying key and values
            for (Character key : letterMap.keySet()) {

                System.out.print(key + ": [");
                Iterator<String> words = letterMap.get(key).iterator();

                while (words.hasNext()) {

                    System.out.print(words.next());

                    if (words.hasNext()) {
                        System.out.print(", ");
                    }

                }

                System.out.println(']');

            }

            in.close();

        }

        catch (FileNotFoundException exception) {
            System.out.print(exception.getMessage());
        }

    }

}