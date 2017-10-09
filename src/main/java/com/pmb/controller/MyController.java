package com.pmb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: he.feng
 * \* Date: 2017/9/20
 * \* Description:
 * \
 */
@Controller
@RequestMapping("/")
public class MyController {

    private static  final Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        logger.info("test");
        return "test";
    }

}
