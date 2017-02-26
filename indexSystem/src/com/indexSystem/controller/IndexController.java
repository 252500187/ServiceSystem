package com.indexSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Noce_ on 2017/2/26.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    public String index(){
        System.out.print(1);
        return "index";
    }
}
