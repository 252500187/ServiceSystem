package com.MessageSystem.controller;

import com.MessageSystem.service.MessageService;
import com.MessageSystem.vo.MessageVO;
import com.indexSystem.system.Dict.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    public List<MessageVO> showMsa(@RequestParam("sta") int start, @RequestParam("len") int length) {
        return messageService.getShowMessageList(start, length);
    }

    @RequestMapping(value = "/sendMsa", method = RequestMethod.POST)
    @ResponseBody
    public boolean sendMsa(HttpSession session, @RequestParam("content") String content) {
        return messageService.sendMessage(session, content);
    }

    @RequestMapping(value = "/toMyMsa", method = RequestMethod.GET)
    public String toMyMsa() {
        return "message/myMessage";
    }

    @RequestMapping(value = "/myMsa", method = RequestMethod.POST)
    @ResponseBody
    public List<MessageVO> myMsa(HttpSession session, @RequestParam("sta") int start, @RequestParam("len") int length) {
        return messageService.getMyMessageList(start, length, session.getAttribute(Dict.SESSION_USER_ID).toString());
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
