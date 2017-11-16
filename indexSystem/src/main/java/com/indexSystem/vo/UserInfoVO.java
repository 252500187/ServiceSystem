package com.indexSystem.vo;

import java.math.BigInteger;

/**
 * Created by lijunbo on 2017/2/27.
 */
public class UserInfoVO {

    private BigInteger id;

    private String userName;

    private String password;

    private String nickName;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
