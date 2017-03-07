package com.MessageSystem.controller;

import com.MessageSystem.service.MessageService;
import com.MessageSystem.vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
@Controller
@RequestMapping("/msa")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/showMsa", method = RequestMethod.POST)
    @ResponseBody
    public List<MessageVO> getSMessageList(@RequestParam("sta") int start, @RequestParam("len") int length) {
        return messageService.getShowMessageList(start, length);
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
