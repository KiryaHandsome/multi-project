package ru.clevertec;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String num) {
        return NumberUtils.createLong(num) > 0;
    }
}
