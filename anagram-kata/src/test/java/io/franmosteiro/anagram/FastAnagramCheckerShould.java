package io.franmosteiro.anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FastAnagramCheckerShould {

    private FastAnagram anagram;

    @BeforeEach
    void setUp(){
        List<String> dictionary = DictionaryReader.read("wordlist.txt");
        this.anagram = new FastAnagram(dictionary);
    }

    @Test
    void empty() {

        List<String> fastAnagrams = this.anagram.getAnagramsFor("");
        assertTrue(fastAnagrams.isEmpty());

    }

    @Test
    void a() {
        List<String> anagrams = this.anagram.getAnagramsFor("a");
        assertTrue(anagrams.isEmpty());
    }

    @Test
    void ab() {
        List<String> anagrams = this.anagram.getAnagramsFor("ab");
        assertTrue(anagrams.contains("ba"));
    }

    @Test
    void abc() {
        List<String> anagrams = this.anagram.getAnagramsFor("abc");
        assertTrue(anagrams.contains("cab"));
    }

    @Test
    void kinship() {

        List<String> anagrams = this.anagram.getAnagramsFor("kinship");
        assertTrue(anagrams.contains("pinkish"));

    }

    @Test
    void enlist() {

        List<String> anagrams = this.anagram.getAnagramsFor("enlist");
        assertTrue(anagrams.contains("inlets"));
        assertTrue(anagrams.contains("listen"));
        assertTrue(anagrams.contains("silent"));

    }

    @Test
    void boaster() {

        List<String> anagrams = this.anagram.getAnagramsFor("boaster");
        assertTrue(anagrams.contains("boaters"));
        assertTrue(anagrams.contains("borates"));

    }

    @Test
    void fresher() {

        List<String> anagrams = this.anagram.getAnagramsFor("fresher");
        assertTrue(anagrams.contains("refresh"));

    }

    @Test
    void sinks() {

        List<String> anagrams = this.anagram.getAnagramsFor("sinks");
        assertTrue(anagrams.contains("skins"));

    }

    @Test
    void knits() {

        List<String> anagrams = this.anagram.getAnagramsFor("knits");
        assertTrue(anagrams.contains("stink"));

    }

    @Test
    void rots() {

        List<String> anagrams = this.anagram.getAnagramsFor("rots");
        assertTrue(anagrams.contains("sort"));

    }

}
