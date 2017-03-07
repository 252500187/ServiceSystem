package com.MessageSystem.service.impl;

import com.MessageSystem.dao.MessageDao;
import com.MessageSystem.service.MessageService;
import com.MessageSystem.vo.MessageVO;
import com.indexSystem.system.Dict.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    public List<MessageVO> getShowMessageList(int start, int length) {
        return messageDao.getShowMessageList(start, length);
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }
}