import java.util.*;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        List<String> commonElArray = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !commonElArray.contains(array1[i])) {
                    commonElArray.add(array1[i]);
                }
            }
        }
        return commonElArray.toArray(new String[0]);
    }
}