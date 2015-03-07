package cn.recursion.core.util;

/**
 * Utility class for String operation.
 *
 * @author victor.li
 * @date 3/7/15
 */
public class StringUtils {

    private StringUtils() {
        // cannot extend from this class
    }

    /**
     * determines a string is null or empty string or not
     * @param input
     * @return  true: if the input string is not null and not empty
     */
    public static boolean isEmpty(String input) {
        if (null != input) {
            if (!input.isEmpty()) {
                return false;
            }
        }
        return true;
    }

}
