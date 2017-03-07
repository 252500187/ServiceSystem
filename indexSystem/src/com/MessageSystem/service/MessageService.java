package com.MessageSystem.service;

import com.MessageSystem.vo.MessageVO;

import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
public interface MessageService {

    public List<MessageVO> getShowMessageList(int start, int length);
}
