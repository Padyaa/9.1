package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int frendsInfoOnly;
    private String imageUrl;
    private Like like;
    private ComentsInfo comentsInfo;
    private Share share;
    private ViewsInfo viewsInfo;
    private String postType;
    private int signerId;
    private Geo geo;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorits;
    private DonutsInfo donutsInfo;
    private int postponedId;
}
