package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount (String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        if (sentence == "") {
            return wordCount;
        }

        String[] words = sentence.split(" ");

        for (var word : words) {
            if (wordCount.get(word) == null) {
                wordCount.put(word, 1);
            } else {
                var count = wordCount.get(word);
                wordCount.remove(word);
                wordCount.put(word, ++count);
            }
        }

        return wordCount;
    }

    public static String toString (Map<String, Integer> wordCount) {
        if (wordCount.size() == 0) {
            return "{}";
        }

        String[] result = new String[wordCount.size()];
        var i = 0;

        for (Map.Entry<String, Integer> word: wordCount.entrySet()) {
            String item = "  " + word.getKey() + ": " + word.getValue() + "\n";
            result[i] = item;
            i++;
        }

        return "{\n" + String.join("", result) + "}";
    }
}
//END
