package com.MessageSystem.dao;

import com.MessageSystem.vo.MessageVO;

import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
public interface MessageDao {

    public List<MessageVO> getShowMessageList(int start, int length);
}
