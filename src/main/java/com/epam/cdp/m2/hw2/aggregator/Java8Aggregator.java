package com.epam.cdp.m2.hw2.aggregator;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class Java8Aggregator implements Aggregator {

    @Override
    public int sum(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }

    @Override
    public List<Pair<String, Long>> getMostFrequentWords(List<String> words, long limit) {
        if (words == null || words.size() == 0) {
            return new ArrayList<>();
        }
        Map<String, Long> frequencyMap = words.stream()
                .collect(groupingBy(identity(), counting()));

        LinkedHashMap<String, Long> resultSet = frequencyMap.entrySet()
                .stream()
                .sorted(reverseOrder(Map.Entry.<String, Long>comparingByValue())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        List<Pair<String, Long>> wordFrequencies = resultSet.entrySet()
                .stream()
                .map(e -> new Pair<>(e.getKey(), e.getValue()))
                .limit(limit)
                .collect(toList());

        return wordFrequencies;
    }

    @Override
    public List<String> getDuplicates(List<String> words, long limit) {
        if (words == null || words.size() == 0) {
            return new ArrayList<>();
        }
        List<String> wordsIgnoreCase = words.stream()
                .map(word -> word.toLowerCase())
                .collect(toList());

        List<String> duplicateList = wordsIgnoreCase.stream()

                .filter(i -> Collections.frequency(wordsIgnoreCase, i) > 1)
                .sorted(Comparator
                        .comparing(String::length)
                        .thenComparing(String::compareToIgnoreCase))
                .map(String::toUpperCase)
                .distinct()
                .limit(limit)
                .collect(Collectors.toList());
        return duplicateList;
    }
}