package io.franmosteiro.anagram;

import org.apache.commons.lang3.time.StopWatch;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagram {

    private List<String> dictionary;

    public Anagram(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getAnagramsFor(String inputWord) {

        return dictionary
                .stream()
                .filter(iteratorWord -> iteratorWord.length() == inputWord.length())
                .filter(iteratorWord -> isAnagram(inputWord, iteratorWord))
                .filter(iteratorWord -> !iteratorWord.equals(inputWord))
                .collect(Collectors.toList());
    }

    private boolean isAnagram(String wordToCompareLeft, String wordToCompareRigth) {

        List<Character> wordToCompareLeftChars = wordToCompareLeft.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .collect(Collectors.toList());

        List<Character> wordToCompareRigthChars = wordToCompareRigth.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .collect(Collectors.toList());

        return IntStream.range(0, wordToCompareLeftChars.size())
                .allMatch(i -> wordToCompareLeftChars.get(i).equals(wordToCompareRigthChars.get(i)));
    }

    public static void main(String[] arges) {

        List<String> words = DictionaryReader.read("wordlist.txt");
        Anagram anagram = new Anagram(words);

        StopWatch sw = new StopWatch();
        sw.start();

        words.forEach(word -> {
            List<String> anagrams = anagram.getAnagramsFor(word);
            if (!anagrams.isEmpty()) {
                System.out.println(word + " " + String.join(" ", anagrams));
            }
        });

        sw.stop();
        System.out.println("Word looked up: " + words.size());
        System.out.println("Time taken (ms): " + sw.getTime());

    }

}
