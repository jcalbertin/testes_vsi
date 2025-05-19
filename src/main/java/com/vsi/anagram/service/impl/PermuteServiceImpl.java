package com.vsi.anagram.service.impl;

import com.vsi.anagram.service.PermutationService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermuteServiceImpl implements PermutationService {

    @Override
    public List<String> permute(String entry) {
        if (entry.length() == 1) {
            return List.of(entry);
        }

        return IntStream.range(0, entry.length())
                .boxed()
                .flatMap(i -> {
                    char character = entry.charAt(i);
                    String rest = entry.substring(0, i) + entry.substring(i + 1);
                    return permute(rest).stream().map(str -> character + str);
                })
                .collect(Collectors.toList());
    }

}
