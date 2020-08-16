package ru.netology.domain;

public class Post {

    private int id;
    private int ownerId;
    private String author;
    private String text;
    private int date;
    private boolean like;
    private boolean friendsOnly;


    private PostLikes postLike;

    private PostComments postComment;

    private PostAttachments postAttachment;

    private PostSettings postSetting;

}
