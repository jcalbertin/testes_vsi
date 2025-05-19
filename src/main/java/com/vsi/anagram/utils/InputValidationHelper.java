package com.vsi.anagram.utils;

public class InputValidationHelper implements InputValidator{

    @Override
    public void validate(String entry) {
        if (entry == null || entry.isEmpty()) {
            throw new IllegalArgumentException("A entrada não pode ser nula ou vazia.");
        }

        if (!entry.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras.");
        }

    }
}
