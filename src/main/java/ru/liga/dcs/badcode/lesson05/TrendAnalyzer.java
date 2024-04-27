package ru.liga.dcs.badcode.lesson05;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrendAnalyzer {
    public HashMap<String, Integer> wordFrequency;

    public TrendAnalyzer() {
        wordFrequency = new HashMap<>();
    }

    public void analyzePosts(List<SocialMediaPost> posts) {
        for (SocialMediaPost post : posts) {
            String[] words = post.content.split("\\s+"); // Зависимость от внутреннего состояния SocialMediaPost
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
    }
}
