package com.indexSystem.dao;

import com.indexSystem.vo.UserInfoVO;

/**
 * Created by lijunbo on 2017/2/27.
 */

public interface UserDao {

    public UserInfoVO getOnUseUserInfo(String userName);

    public void addUser(UserInfoVO user);

    public int changePassword(String id, String newPassword, String oldPassword);

    public UserInfoVO getInfo(String id);

    public int editInfo(String id, UserInfoVO user);
}