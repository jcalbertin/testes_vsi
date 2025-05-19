package com.vsi.anagram.service.impl;

import com.vsi.anagram.service.PermutationService;
import com.vsi.anagram.utils.InputValidator;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AnagramServiceImplTest {

    private final InputValidator validator = mock(InputValidator.class);
    private final PermutationService permutationService = mock(PermutationService.class);
    private final AnagramServiceImpl anagramService = new AnagramServiceImpl(validator, permutationService);

    @Test
    void testGenerateAnagram() {
        String input = "ab";
        List<String> permutations = List.of("ab", "ba");

        doNothing().when(validator).validate(input);
        when(permutationService.permute(input)).thenReturn(permutations);

        List<String> result = anagramService.generate(input);

        assertEquals(permutations, result);
        verify(validator).validate(input);
        verify(permutationService).permute(input);
    }
}
