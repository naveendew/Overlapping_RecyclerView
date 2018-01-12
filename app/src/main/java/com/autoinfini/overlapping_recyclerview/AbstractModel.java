package com.autoinfini.overlapping_recyclerview;

public class AbstractModel {

    private String title;

    private String message;

    private String img_url;

    public AbstractModel(String title, String message, String img_url) {
        this.title = title;
        this.message = message;
        this.img_url = img_url;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public AbstractModel(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public AbstractModel() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
