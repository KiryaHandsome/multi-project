package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void positiveNumberTest() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("123"));
    }

    @Test
    public void nullNumberTest() {
        Assertions.assertThrows(NullPointerException.class,
                () -> StringUtils.isPositiveNumber(null));
    }

    @Test
    public void negativeNumberTest() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-12"));
    }
}
