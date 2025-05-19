package com.vsi.anagram.service.impl;

import com.vsi.anagram.service.AnagramService;
import com.vsi.anagram.service.PermutationService;
import com.vsi.anagram.utils.InputValidator;

import java.util.List;

public class AnagramServiceImpl implements AnagramService {

    private final InputValidator validator;
    private final PermutationService permutationService;

    public AnagramServiceImpl(InputValidator validator, PermutationService generator) {
        this.validator = validator;
        this.permutationService = generator;
    }

    public List<String> generate(String entry) {
        validator.validate(entry);
        return permutationService.permute(entry);
    }
}
