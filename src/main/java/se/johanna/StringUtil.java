package se.johanna;

public class StringUtil {
    public static String revers(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
