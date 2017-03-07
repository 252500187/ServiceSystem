package com.indexSystem.dao;

import com.indexSystem.vo.UserInfoVO;

/**
 * Created by lijunbo on 2017/2/27.
 */

public interface UserDao {

    public UserInfoVO getOnUseUserInfo(String userName);
}
