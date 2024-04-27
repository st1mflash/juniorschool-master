package ru.liga.dcs.badcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Класс BLOGcontainer представляет собой блог-пост с заголовком, содержимым и комментариями.
 */
public class BLOGcontainer {
    private static final int x76t = 100; // Максимальная длина заголовка
    private static final int Z45_data = 1000; // Максимальная длина содержимого

    private final String _TitleX;
    private String _ContentY;
    private final List<COMMENTS> _commentsList;

    /**
     * Конструктор для создания нового блог-поста.
     *
     * @param tit  Заголовок поста
     * @param _con Содержимое поста
     */
    public BLOGcontainer(String tit, String _con) {
        if (tit.length() > x76t || _con.length() > Z45_data) {
            throw new IllegalArgumentException("Превышена максимальная длина");
        }
        this._TitleX = tit;
        this._ContentY = _con;
        this._commentsList = new ArrayList<>();
    }

    /**
     * Добавляет комментарий к блог-посту.
     *
     * @param avtor Автор комментария
     * @param data  Текст комментария
     */
    public void add_comments(String avtor, String data) {
        COMMENTS newComment = new COMMENTS(avtor, data);
        _commentsList.add(newComment);
    }

    /**
     * Обновление содержимого.
     *
     * @param newContent новое содержимое
     */
    public void newDataX(String newContent) {
        if (newContent.length() > Z45_data) {
            throw new IllegalArgumentException("Превышена максимальная длина");
        }
        this._ContentY = newContent;
    }

    /**
     * Метод для отображения информации.
     */
    public void consoleInfo() {
        System.out.println("Заголовок: " + _TitleX);
        System.out.println("Содержимое: " + _ContentY);
        System.out.println("Комментарии:");
        for (COMMENTS comment : _commentsList) {
            System.out.println(" - " + comment.authorX + ": " + comment.textY + " (Дата: " + comment.dateX + ")");
        }
    }

    /**
     * Комментарий к блог-посту.
     */
    public class COMMENTS {
        private String authorX;
        private String textY;
        private Date dateX;

        /**
         * Конструктор COMMENTS.
         *
         * @param author автор
         * @param data   текст
         */
        public COMMENTS(String author, String data) {
            this.authorX = author;
            this.textY = data;
            this.dateX = new Date();
        }

        // Геттеры и сеттеры для полей, если необходимо
    }

    public static void main(String[] args) {
        BLOGcontainer blog = new BLOGcontainer("Заголовок", "Содержимое");
        blog.add_comments("Автор1", "Комментарий1");
        blog.add_comments("Автор2", "Комментарий2");
        blog.consoleInfo();
    }
}
