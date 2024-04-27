package ru.liga.dcs.badcode.lesson05;

import java.util.HashMap;
import java.util.Map;

public class UserEngagementTracker {

    public UserEngagementTracker() {
    }

    public void printEngagement(TrendAnalyzer trendAnalyzer) {
        HashMap<String, Integer> trends = trendAnalyzer.wordFrequency;
        for (Map.Entry<String, Integer> entry : trends.entrySet()) {
            if (entry.getValue() >= 3) {
                System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
}