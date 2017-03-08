package com.MessageSystem.service;

import com.MessageSystem.vo.MessageVO;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
public interface MessageService {

    public List<MessageVO> getShowMessageList(int start, int length);

    public boolean sendMessage(HttpSession session, String content);
}
