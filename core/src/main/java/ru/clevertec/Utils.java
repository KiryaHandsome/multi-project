package ru.clevertec;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... nums) {
        if (nums.length == 0) return false;
        return Arrays.stream(nums)
                .allMatch(StringUtils::isPositiveNumber);
    }
}
