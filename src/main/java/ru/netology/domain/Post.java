package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int date;
    private FunctionPost functionPost;
    private String text;
    private String imageUrl;
    private Like like;
    private ComentsInfo comentsInfo;
    private Share share;
    private int views;
}
