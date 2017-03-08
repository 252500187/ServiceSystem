package com.MessageSystem.dao.impl;

import com.MessageSystem.dao.MessageDao;
import com.MessageSystem.vo.MessageVO;
import com.indexSystem.dao.base.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
@Repository("messageDao")
public class MessageDaoImpl implements MessageDao {

    @Autowired
    BaseDao baseDao;

    public List<MessageVO> getShowMessageList(int start, int length) {
        return baseDao.getJdbcTemplate().query("SELECT * FROM message_list_info LIMIT ?,?", new BeanPropertyRowMapper<MessageVO>(MessageVO.class), start, length);
}

    public void sendMessage(String userId, String content) {
        baseDao.getJdbcTemplate().update("INSERT INTO message_info(user_id,content,time) VALUES (?,?,?)", userId, content, baseDao.getDateFormat().format(new Date()));
    }
}
