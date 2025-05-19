package com.vsi;

import com.vsi.anagram.service.impl.AnagramServiceImpl;
import com.vsi.anagram.service.impl.PermuteServiceImpl;
import com.vsi.anagram.utils.InputValidationHelper;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        var validator = new InputValidationHelper();
        var generator = new PermuteServiceImpl();
        var anagramService = new AnagramServiceImpl(validator, generator);

        List<String> anagrams = anagramService.generate("abc");
        anagrams.forEach(System.out::println);
    }
}