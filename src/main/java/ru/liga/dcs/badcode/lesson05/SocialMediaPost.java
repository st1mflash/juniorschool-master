package ru.liga.dcs.badcode.lesson05;

public class SocialMediaPost {
    public String content; // Публичное поле, нарушение инкапсуляции

    public SocialMediaPost(String content) {
        this.content = content;
    }

    // Метод validate для проверки длины контента
    public void validate()  {
        if (content.length() < 10 || content.length() > 1024) {
            throw new IllegalArgumentException("Invalid post length.");
        }
    }
}
