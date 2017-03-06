package com.MessageSystem.dao.impl;

import com.MessageSystem.dao.MessageDao;
import com.MessageSystem.vo.MessageVO;
import com.indexSystem.dao.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
@Repository("messageDao")
public class MessageDaoImpl extends BaseDao implements MessageDao {

    public List<MessageVO> getMessageList(int start, int end, int state) {
        return jdbcTemplate.queryForList("", MessageVO.class, start, end, state);
    }
}
