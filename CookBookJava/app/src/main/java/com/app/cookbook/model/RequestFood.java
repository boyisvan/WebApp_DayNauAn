package com.app.cookbook.model;

public class RequestFood {

    private String content;

    public RequestFood() {
    }

    public RequestFood(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
