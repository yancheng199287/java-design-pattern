package com.oneinlet;

/**
 * 请求类
 */
public class RequestClass {
    private String username;
    private String date;

    public void open() {
        System.out.println(username+" "+date+"点，打开电视");
    }
    public void down() {
        System.out.println(username+" "+date+"点，关闭电视");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
