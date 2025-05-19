package com.vsi.anagram.utils;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidationHelperTest {

    private final InputValidationHelper validator = new InputValidationHelper();

    @Test
    void testValidateNullInput() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(null));
    }

    @Test
    void testValidateEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(""));
    }

    @Test
    void testValidateInvalidCharacters() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate("abc123"));
    }

    @Test
    void testValidateValidInput() {
        assertDoesNotThrow(() ->  validator.validate("abc"));
    }
}
