package ru.liga.dcs.badcode.lesson05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocialMediaPost post1 = new SocialMediaPost("Short");
        post1.validate();
        SocialMediaPost post2 = new SocialMediaPost("This is a valid social media post content with adequate length");
        post2.validate();

        List<SocialMediaPost> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);

        TrendAnalyzer trendAnalyzer = new TrendAnalyzer();
        trendAnalyzer.analyzePosts(posts);

        UserEngagementTracker engagementTracker = new UserEngagementTracker();
        engagementTracker.printEngagement(trendAnalyzer);
    }
}
