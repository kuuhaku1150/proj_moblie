package com.example.aws.final_final_proj.Models;

import com.google.firebase.database.ServerValue;

import static java.util.EnumSet.range;

public class Comment {

    private String content,uid,uimg,uname;
    private Float urate;
    private Object timestamp;


    public Comment() {
    }

    public Comment(String content, String uid, String uimg, String uname, float urate) {
        this.content = content;
        this.uid = uid;
        this.uimg = uimg;
        this.uname = uname;
        this.urate = urate;
        this.timestamp = ServerValue.TIMESTAMP;
    }


    public Comment(String content, String uid, String uimg, String uname, Object timestamp, float urate) {
        this.content = content;
        this.uid = uid;
        this.uimg = uimg;
        this.uname = uname;
        this.urate = urate;
        this.timestamp = timestamp;

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Object getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }


    public Float getUrate() { return urate; }

    public void setUrate(Float urate) { this.urate = urate; }
}
