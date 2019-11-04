package io.franmosteiro.anagram;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DictionaryReader {

    public static List<String> read(String filename) {
        try {
            return Files.readAllLines(Paths.get(DictionaryReader.class.getResource("/" + filename).toURI()), StandardCharsets.ISO_8859_1);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Invalid file path: " + filename);
    }

}
