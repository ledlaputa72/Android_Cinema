package com.ledlaputa.cinema;

public class CommentItem {
    //한줄평에 들어갈 정보

    int userId; //유저 아이콘
    String userName; //유저 아이디
    String time; //작성시간
    String commentText; //한줄평 내용

    //생성자
    public CommentItem(int userId, String userName, String time, String commentText) {
        this.userId = userId;
        this.userName = userName;
        this.time = time;
        this.commentText = commentText;
    }

    //getter setter

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    //toString

    @Override
    public String toString() {
        return "CommentItem{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", time='" + time + '\'' +
                ", comentText='" + commentText + '\'' +
                '}';
    }
}
