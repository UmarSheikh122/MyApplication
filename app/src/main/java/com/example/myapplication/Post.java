package com.example.myapplication;

public class Post {
    private String userId;
    private String id;
    private String title;

//    @SeriallizedName("body")
    private String body;

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
