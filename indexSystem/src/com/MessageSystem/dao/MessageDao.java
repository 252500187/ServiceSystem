package com.MessageSystem.dao;

import com.MessageSystem.vo.MessageVO;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
public interface MessageDao {

    public List<MessageVO> getShowMessageList(int start, int length);

    public void sendMessage(String userId, String content);

    public List<MessageVO> getMyMessageList(int start, int length, String userId);
}
