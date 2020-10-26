package com.epam.cdp.m2.hw2.aggregator;

import javafx.util.Pair;

import java.util.*;

public class Java7Aggregator implements Aggregator {

    @Override
    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Override
    public List<Pair<String, Long>> getMostFrequentWords(List<String> words, long limit) {
        if (words == null || words.size() == 0) {
            return new ArrayList<>();
        }
        List<Pair<String, Long>> wordFrequencies = new ArrayList<>();
        Map<String, Long> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1L);
            } else {
                frequencyMap.put(word, 1L);
            }
        }
        List<Map.Entry<String, Long>> list = new LinkedList<>(frequencyMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> e1, Map.Entry<String, Long> e2) {
                if (e1.getValue() > e2.getValue()) {
                    return -1;
                } else if (e1.getValue() == e2.getValue()) {
                    return e1.getKey().toLowerCase().compareTo(e2.getKey().toLowerCase());
                } else {
                    return 1;
                }
            }
        });
        for (Map.Entry<String, Long> entry : list) {
            wordFrequencies.add(new Pair(entry.getKey(), entry.getValue()));
        }

            return wordFrequencies.size()<=limit ?wordFrequencies : wordFrequencies.subList(0,(int)limit );
    }



    @Override
    public List<String> getDuplicates(List<String> words, long limit) {
        if (words == null || words.size() == 0) {
            return new ArrayList<>();
        }
        HashSet<String> set = new HashSet<String>();
        List<String> duplicateList = new ArrayList<String>();

        for (String word : words) {
            word = word.toUpperCase();
            if (!set.contains(word)) {
                set.add(word);
            } else {
                duplicateList.add(word);
            }
        }
        duplicateList.sort( new Comparator<String> () {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()!=o2.length()) {
                    return o1.length() - o2.length();
                }
                return o1.compareToIgnoreCase(o2);
            }
        });

        return duplicateList.size() <= limit ? duplicateList : duplicateList.subList(0, (int) limit);
    }
}
