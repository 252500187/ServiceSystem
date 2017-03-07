package com.MessageSystem.vo;

import java.security.Timestamp;

/**
 * Created by lijunbo on 2017/3/6.
 */
public class MessageVO {

    private String time;

    private String content;

    private String userId;

    private byte state;


    private String nickName;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time.substring(0, 19);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
