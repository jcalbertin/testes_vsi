package com.vsi.anagram.service.impl;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermuteServiceImplTest {

    private final PermuteServiceImpl permuteService = new PermuteServiceImpl();

    @Test
    void testPermuteSingleCharacter() {
        List<String> result = permuteService.permute("a");
        assertEquals(List.of("a"), result);
    }

    @Test
    void testPermuteTwoCharacters() {
        List<String> result = permuteService.permute("ab");
        assertEquals(List.of("ab", "ba"), result);
    }

    @Test
    void testPermuteThreeCharacters() {
        List<String> result = permuteService.permute("abc");
        assertEquals(List.of("abc", "acb", "bac", "bca", "cab", "cba"), result);
    }
}
